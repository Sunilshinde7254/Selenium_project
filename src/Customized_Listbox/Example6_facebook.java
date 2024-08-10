package Customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_facebook 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//click on "Create new account" link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		act.click(month);
		//select July Option
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}
}
