package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_FullScreen 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 
	 driver.manage().window().fullscreen();
	 
}
}
