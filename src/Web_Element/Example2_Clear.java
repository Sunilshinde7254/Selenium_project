package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement un =driver.findElement(By.xpath("//input[@name='email']"));
       un.sendKeys("abc");
       Thread.sleep(2000);
       un.clear();
       Thread.sleep(2000);
       un.sendKeys("xyz");

	}
}
