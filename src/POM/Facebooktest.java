package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest 
{
	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com ");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		FaceBookLoginpage login = new FaceBookLoginpage(driver);
		login.Username();
		login.EnterPassword();
		login.Clicklogin_button();
		
       
	}
}
