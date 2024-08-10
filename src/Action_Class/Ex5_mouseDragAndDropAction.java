package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_mouseDragAndDropAction 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");


	//	WebElement srcelement = driver.findElement(By.xpath(" (//a[@class='button button-orange'])[1]"));

	//	WebElement destelement = driver.findElement(By.xpath("// li[@class='placeholder'] "));

		WebElement srcelement = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		
		WebElement destelement = driver.findElement(By.xpath("(//div[@class='uiwidget-content'])[3]"));

		
		Actions act=new Actions(driver);
		 act.dragAndDrop(srcelement, destelement).perform();



		//act.moveToElement(srcelement).clickAndHold().moveToElement(destelement).release().perform();




	}
}
