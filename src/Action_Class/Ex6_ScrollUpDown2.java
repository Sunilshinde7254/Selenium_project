package Action_Class;

import java.awt.Desktop.Action;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_ScrollUpDown2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 
	 Actions act = new Actions(driver);
	 
	//scroll down (2nd para +Ve value
	 act.scrollByAmount(0, 300).perform();
	 
	 Thread.sleep(2000);
	 
	 //scroll up (2nd para -Ve value)
	 act.scrollByAmount(0, -100).perform();
	 
	//scroll right (1st para +Ve value)
	 act.scrollByAmount(200, 0).perform();
	 
	 Thread.sleep(2000);
	 
	 //scroll left (1st para -Ve value)
	 act.scrollByAmount(-50, 0).perform();
}
}
