package JavaScriptExecutorsmethoddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptdemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=  new ChromeDriver();         
		//  ChromeDriver driver = new ChromeDriver();


		driver.get("file:///C:/Users/sunil/OneDrive/Desktop/Checkbox.html");
		Object input = driver.findElement(By.xpath("//input[@type=\"text\"]"));


		JavascriptExecutor js = (JavascriptExecutor)driver;        // upcasting  
		//  JavascriptExecutor js = driver;                          // 
		js.executeScript("arguments[0].setAttribute('value','sunil')", input);



		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		js.executeScript("arguments[0].click()",checkbox);





	}
}
