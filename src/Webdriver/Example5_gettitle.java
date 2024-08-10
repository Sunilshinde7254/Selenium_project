package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_gettitle 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com");
     
//     String title = driver.getTitle();
//     System.out.println(title);
     
     System.out.println(driver.getTitle());
}
}
