package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_Tagname
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
//driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/Tagname.html");
driver.get("https://www.facebook.com/");
//enter FN
driver.findElement(By.tagName("input")).sendKeys("abc");
//enter LN
driver.findElement(By.tagName("input")).sendKeys("xyz");


List<WebElement> images= driver.findElements(By.tagName("img"));
System.out.println("SIZE OZ IMG"+images.size());
}
}