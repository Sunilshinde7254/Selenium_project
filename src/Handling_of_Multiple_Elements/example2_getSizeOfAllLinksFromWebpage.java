package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getSizeOfAllLinksFromWebpage 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ " );

		//  WebElement element = driver.findElement(By.xpath(" //a//"));   // single link

		List<WebElement> Allinks = driver.findElements(By.xpath("//a "));    // multiple link 
		int size = Allinks.size();
		
		System.out.println("Size:"+size);
		
//		int getsize = driver.findElements(By.xpath("//a")).size();
//		System.out.println("getsize:"+getsize);
		
		System.out.println(driver.findElements(By.xpath("//a")).size());

		for(WebElement link:Allinks)
		{
			System.out.println(link.getText());
		}



	}
}
