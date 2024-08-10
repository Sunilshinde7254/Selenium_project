package Webdriver;

import java.awt.Window;
import java.lang.StackWalker.Option;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example7_Minimize 
{
  @SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(3000);
	 
	
	 driver.manage().window().minimize();


}
}
