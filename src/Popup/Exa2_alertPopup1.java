package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exa2_alertPopup1 
{
	public static void main(String[] args) 
	{
         WebDriver driver = new ChromeDriver();
         driver.get(" https://demo.guru99.com/");
         
         driver.findElement(By.xpath("//input[@name= 'emailid']")).sendKeys("sunilshinde@gmail.com");
         
         driver.findElement(By.xpath("//input[@type='submit'] ")).click();
         
       //1: get text from alert popup
         String text = driver.switchTo().alert().getText();
         System.out.println(text);
         
         //2: click on Cancel btn from alert popup
         //driver.switchTo().alert().dismiss()
         
       //3: click on OK btn from 1st alert popup
         driver.switchTo().alert().accept();
         
         //3: click on OK btn from 2nd alert popup
         driver.switchTo().alert().accept();
	}
}
