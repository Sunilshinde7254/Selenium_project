package TestNg;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	@Test
	public void OpenfacebookApp() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://meet.google.com/");
		Thread.sleep(2000);
		driver.close();
		
	}
}
