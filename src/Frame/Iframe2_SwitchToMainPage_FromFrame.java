package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2_SwitchToMainPage_FromFrame
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		//switch to frame
		driver.switchTo().frame("iframeResult"); 

		//click on "Click me to display Date and Time" btn from Iframe
		driver.findElement(By.xpath("//button[contains(text(),'Clickme')]")).click();

		//switch to main page from Iframe
		driver.switchTo().parentFrame();

		//driver.switchTo().defaultContent();

		//click on "Open Menu" btn from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}
