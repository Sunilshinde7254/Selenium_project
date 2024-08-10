package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_locators 
{
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
      //click on Create New Acc link	
        
     // driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Sunil Shinde");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("776786295");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
      
      
      

        
	}
}
