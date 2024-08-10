package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.get("https://www.google.com");

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.Facebook.com/");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();


	}
}
