package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WithoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
      driver.manage().window().maximize();
         

      
      driver.findElement(By.xpath("//input[@id='user-name'] ")).sendKeys("standard_user");
      driver.findElement(By.xpath("//input[@id='password'] ")).sendKeys("secret_sauce");
      driver.findElement(By.xpath("//input[@name='login-button']")).click();
      
      String text = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
      String exceptd="Swag Labs";
      
      if(exceptd.equals(text))
      {
    	  System.out.println(" Test Case Pass");
      }
      else
      {
    	  System.out.println("Test Case fail");
      }
      driver.findElement(By.xpath("//div[@class='bm-burger-button'] ")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath(" //a[@id='logout_sidebar_link']")).click();
      Thread.sleep(2000);
     // driver.quit();
      
      
      
	}
}
