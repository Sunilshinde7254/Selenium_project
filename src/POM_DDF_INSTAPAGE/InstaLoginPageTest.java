package POM_DDF_INSTAPAGE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class InstaLoginPageTest 
{
  
	Instaloginpage login;
	InstaHomepage home;
	WebDriver driver;
	
	Sheet sh;
	File file;
	@BeforeClass
	public void InstaOpenBrowser() throws EncryptedDocumentException, IOException
	{
		// FileInputStream file = new FileInputStream("  ");
		 FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		 sh= WorkbookFactory.create(file).getSheet("DDF");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		 driver.get("https://www.instagram.com/");
		 
		 login = new Instaloginpage(driver);
		 home = new InstaHomepage(driver);
		 
		 ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		 
	
		 
	}
	@BeforeMethod
	public void Instalogintoapp() throws InterruptedException, IOException
	{
		login.InstaUsername(sh.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		
		login.InstaPassword(sh.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		
		login.Instalogin();
		
	}
	@Test
	public void InstapgeTakeSS() throws IOException 
	{ 
		
		File src = home.getLogo().getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\InstaLogo_11.png");
        FileHandler.copy(src, dest);
        
 
	}
	@AfterMethod
	public void InstaLogoutFromApp() throws InterruptedException
	{ 
		home.InstaClickOnMoreOption();
		
		
		home.InstaLogout();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout was not successful.");
		
		
	}
	@AfterClass
	public void clsoeBrowser()
	{
		driver.quit();
	}
}
