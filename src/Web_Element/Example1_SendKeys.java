package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SendKeys 
{ 
	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 WebElement elemnt = driver.findElement(By.xpath("//input[@name='email']"));
		 elemnt.sendKeys("abc");
	}

}
