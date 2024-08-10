package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SwagLabsLoginPage login = new SwagLabsLoginPage(driver);
		login.EnterUN();
		login.EnterPass();
		login.Clicklogin();
		Thread.sleep(2000);
		
		SwagLabsHomePage home = new SwagLabsHomePage(driver);
		
		home.veryfylogo();
		home.openmenubar();
		Thread.sleep(2000);
		
		
		SwagLabsOpenMenuPage openmenu = new SwagLabsOpenMenuPage(driver);
		openmenu.clickOnLogoutBtn();
		Thread.sleep(2000);
		
		driver.quit();
	}
} 
