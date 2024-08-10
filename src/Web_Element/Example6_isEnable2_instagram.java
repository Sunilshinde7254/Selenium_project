package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_isEnable2_instagram 
{
	public static void main(String[] args) 
	{
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.instagram.com/");
           boolean result = 
           driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
           System.out.println(result);

           
           
	}
}
