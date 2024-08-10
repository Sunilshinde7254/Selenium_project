package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example12_MultiBrowserTesting 
{
  public void loginToSwagLabApp(String browserName) throws InterruptedException
  {
	  WebDriver driver= null;
	  
	  if(browserName.equals("Chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if (browserName.equals("firefox")) 
	  {
	   driver =new FirefoxDriver();
	  }
	  else if (browserName.equals("edge"))
	  {
	  driver=new EdgeDriver();
	  }

	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='login-button']")).click();
	  Thread.sleep(3000);
	  String actLogoText = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
	  String expLogoText = "Swag Labs";
	  if(actLogoText.equals(expLogoText))
	  {
	  System.out.println("TC Pass");
	  }
	  else
	  {
	  System.out.println("TC Fail");
	  }
	  driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	  Thread.sleep(2000);
	  driver.quit();

	  
  }
}

