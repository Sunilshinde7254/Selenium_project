package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
				org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		SwagLabsLoginPage login = new SwagLabsLoginPage(driver);
		login.EnterUN(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		login.EnterPass(sh.getRow(0).getCell(1).getStringCellValue());	
		Thread.sleep(20000);
		login.Clicklogin();
		Thread.sleep(2000);
		
		
		SwagLabsHomePage home = new SwagLabsHomePage(driver);
		home.veryfylogo(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		home.openmenubar();
		Thread.sleep(2000);
		
		
		SwagLabsOpenMenuPage openmenu = new SwagLabsOpenMenuPage(driver);
		openmenu.clickOnLogoutBtn();
		Thread.sleep(2000);
	
	

		driver.quit();
	}
} 
