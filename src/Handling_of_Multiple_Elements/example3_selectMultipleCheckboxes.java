package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_selectMultipleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sunil/OneDrive/Desktop/Checkbox.html");
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox'] "));
		
		for(WebElement checkbox:allcheckbox)
		{
			checkbox.click();
			Thread.sleep(2000);
			
		}
	}
}
