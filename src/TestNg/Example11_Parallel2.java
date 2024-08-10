package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_Parallel2 
{
	@Test
	public void OpenGoogleApp() throws InterruptedException 
	{
	Reporter.log("--Open Google App--", true);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.quit();
	}
}
