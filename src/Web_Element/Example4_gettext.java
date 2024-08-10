package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_gettext 
{
	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       
       String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
       System.out.println(text);
       
       

	}
}
