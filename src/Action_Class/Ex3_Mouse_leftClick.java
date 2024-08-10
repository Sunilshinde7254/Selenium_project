package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_Mouse_leftClick 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		WebElement leftclick = driver.findElement(By.xpath("(//a[text() ='Sign in'])[1]"));

		Actions act = new Actions(driver);

		// Apporach 1
		  act.moveToElement(leftclick).perform();
		  act.click().perform();

		// Apporach 2
		act.moveToElement(leftclick).click().perform();


		// Apporach 3
		 act.click(leftclick).perform();






	}
}
