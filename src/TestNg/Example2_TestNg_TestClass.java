package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Example2_TestNg_TestClass 
{
	@Test
	public void OpenfacebookApp() throws InterruptedException
  {   
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
