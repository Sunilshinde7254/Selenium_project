package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_locators 
{
	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
       
//      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sunilshinde");
//      driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("Anil");
//    //  driver.findElement(By.xpath("//[@id=\"pass\"]")).sendKeys("123");
//      driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("Sunil123");
      
      driver.findElement(By.xpath("//input[@name='login']")).click();

      
      
	}
}
