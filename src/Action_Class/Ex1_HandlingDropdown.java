package Action_Class;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_HandlingDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		//setp1 
		WebElement eweb = driver.findElement(By.xpath("//a[text()='My eBay']"));
		//Step 2
		Actions act = new Actions(driver);

		//step3
		act.moveToElement(eweb).perform();
		Thread.sleep(2000);

		//Step4

		////click on Watchlist link from dropdown
	 driver.findElement(By.xpath("//a[text()='Watchlist'] ")).click();


	}
}
