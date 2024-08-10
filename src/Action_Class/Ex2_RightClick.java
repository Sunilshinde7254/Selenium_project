package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_RightClick 
{
	public static void main(String[] args) 
	{
         WebDriver driver= new ChromeDriver();
       
         driver.get("https://www.ebay.com/");
         WebElement sell = driver.findElement(By.xpath(" //a[text()='Sell']"));
         Actions act = new Actions(driver);
         
         //Approach1
         act.moveToElement(sell).perform();
         act.contextClick().perform();
         
         //Approach2
         
         act.moveToElement(sell).contextClick().perform();
       // act.moveToElement(sell).contextClick().build().perform();  // Build : combine multiple action
         
         // Approach3
         act.contextClick(sell).perform();
         
         
         
         
	}
}
