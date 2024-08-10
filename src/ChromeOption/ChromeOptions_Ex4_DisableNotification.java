package ChromeOption;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Ex4_DisableNotification 
{
	public static void main(String[] args) 
	{
       ChromeOptions op = new ChromeOptions();
       op.addArguments("--disable-notifications");
       WebDriver driver = new ChromeDriver(op);

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       driver.manage().window().maximize();
       driver.get("https://www.redbus.in/");
       
       
	}
}
