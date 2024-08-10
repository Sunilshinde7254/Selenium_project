package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_locators 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on forgotten pwd link
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		
		//driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	}
}
