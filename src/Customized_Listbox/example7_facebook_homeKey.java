package Customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example7_facebook_homeKey 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//click on "Create new account" link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		act.click(month);
	
		
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		//select July Option
		for(int i=0;i<=6;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		act.sendKeys(Keys.ENTER).perform();

	}
}
