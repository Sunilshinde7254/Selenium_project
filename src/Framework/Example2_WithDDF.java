package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_WithDDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
      driver.manage().window().maximize();
      
      String username = sh.getRow(0).getCell(0).getStringCellValue();
      driver.findElement(By.xpath("//input[@id='user-name'] ")).sendKeys(username);
      Thread.sleep(2000);
      
      String Password = sh.getRow(0).getCell(1).getStringCellValue();
      driver.findElement(By.xpath(" //input[@id='password']")).sendKeys(Password );
      Thread.sleep(2000);
      
      driver.findElement(By.xpath(" //input[@type='submit']")).click();
      Thread.sleep(2000);
      
      String actLogoText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
      String expLogoText = sh.getRow(0).getCell(2).getStringCellValue();
      if(actLogoText.equals(expLogoText))
      {
      System.out.println("TC Pass");
      }
      else
      {
      System.out.println("TC Fail");
      }
      //click on menu btn
      driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
      Thread.sleep(2000);
      //click on menu btn
      driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
      Thread.sleep(2000);
      driver.quit();
	}
}
