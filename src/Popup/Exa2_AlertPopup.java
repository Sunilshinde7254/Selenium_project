package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exa2_AlertPopup 
{
	public static void main(String[] args) 
	{
          WebDriver driver = new ChromeDriver();
          driver.get(" https://demo.guru99.com/");
          
          driver.findElement(By.xpath("//input[@name= 'emailid']")).sendKeys("100");
          
          driver.findElement(By.xpath("//input[@type='submit'] ")).click();
          
          //switch on alreat popup
          Alert art = driver.switchTo().alert();
          
          
          //1. get text from alreat popup 
           String text = art.getText();
           System.out.println(text);
            
           //2 . click cancle button on alert button 
          // art.dismiss();
           
           //3. click on okk button a
           art.accept();
           
           //4. Enter value in alert popup
           art.sendKeys("9767567");
           
           

	}
}
