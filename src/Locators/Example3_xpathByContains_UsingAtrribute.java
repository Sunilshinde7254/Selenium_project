package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_xpathByContains_UsingAtrribute 
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  //enter UN
	  driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
	  //enter PWD
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("xyz");
}
}
 