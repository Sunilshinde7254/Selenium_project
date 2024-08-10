package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_isSelcted 
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(2000);
	boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).isSelected();
	System.out.println(result);
	
	if(result) 
	{
	System.out.println("radio btn is selected");
	} 
	else
	{
	System.out.println("radio btn is De-Selected");
	}
	}
}

