package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class example4_selectLast_And_FirstOption_usingEnd_HomeKey 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.nobroker.in/ ");

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi'] "));

		Actions act = new Actions(driver);
		act.click(element);

		Thread.sleep(3000);
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		// 
		Thread.sleep(3000);
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		// Disable 
		Thread.sleep(3000);
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		



	}
}
