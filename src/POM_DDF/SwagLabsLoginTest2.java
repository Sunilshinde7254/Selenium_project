package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest2 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");



		SwagLabsLoginPage login =new SwagLabsLoginPage(driver); //early or basic initialization
		login.EnterUN(sh.getRow(0).getCell(0).getStringCellValue());
		login.EnterPass(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		
		login.Clicklogin();
		Thread.sleep(2000);
		
		
	}
}