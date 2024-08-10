package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getcurrenturl
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com");
     Thread.sleep(2000);
     
//     driver.get("https://www.instagram.com/");
//     System.out.println(driver.getCurrentUrl());
     
     
     
//     String url= driver.getCurrentUrl();
//     System.out.println(url);
     
    System.out.println(driver.getCurrentUrl());

 }
}
