package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
        
        Thread.sleep(2000);
        String info =driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
        System.out.println(info);
        
        
	}
}
