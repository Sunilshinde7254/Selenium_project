package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_Parallel1 
{
	@Test
	public void OpenFacebookApp() throws InterruptedException 
	{
	Reporter.log("--Open Facebook App--", true);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.quit();
	}

}
