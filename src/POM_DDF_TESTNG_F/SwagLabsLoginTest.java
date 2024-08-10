package POM_DDF_TESTNG_F;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest
{
	SwagLabsLoginPage login;
	SwagLabsHomePage home;
	SwagLabsOpenMenuPage openmenu;
	Sheet sh;
	WebDriver driver;
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{
	//	FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum.xlxs");
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.saucedemo.com/");

		login = new SwagLabsLoginPage(driver);
		home = new SwagLabsHomePage(driver);
		openmenu = new SwagLabsOpenMenuPage(driver);



	}
	@BeforeMethod
	public void logintoApp() throws InterruptedException
	{
		login.Impswaglabsloginpageusername(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		login.ImpswaglabsloginpagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		login.ImpswagloginpageLogin();
		Thread.sleep(2000);

	}
	@Test
	public void logotextverify() 
	{
       String actuallogotext = home.getSwagLabsHomePageLogoText();
       String excptlogotext = sh.getRow(0).getCell(2).getStringCellValue();
      
       Assert.assertEquals(actuallogotext, excptlogotext,"Failed- both results diff");
	}
	public void logoutFromApp() throws InterruptedException 
	{	
		home.clickswaglaghomepageopenmenu_button();
		Thread.sleep(2000);
		openmenu.clickSwagLabsOpenMenuPageLogout();
		Thread.sleep(2000);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
