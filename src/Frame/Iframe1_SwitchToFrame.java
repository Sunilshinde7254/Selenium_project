package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1_SwitchToFrame 
{
	public static void main(String[] args) 
	{
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          
        
          driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
          
          
          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); 
          driver.switchTo().frame(1);
          
          //driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
          driver.findElement(By.xpath("//button[@type='button']")).click();


	}
}
