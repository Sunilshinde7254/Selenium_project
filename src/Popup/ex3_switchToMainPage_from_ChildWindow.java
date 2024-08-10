package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_switchToMainPage_from_ChildWindow
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on "NewTab" btn from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get childWindow ID
		Set<String> allIds = driver.getWindowHandles(); //{mainPageID, childWindowID}
		ArrayList<String> al=new ArrayList<String>(allIds); //{mainPageID(0), childWindowID(1)}
		
		//switch to child window
		driver.switchTo().window(al.get(1)); //String childWindowID
		
		//click on "Training" link from ChildWindow
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		//switch to main page from child window
		driver.switchTo().window(al.get(0)); //String main page ID
		
		//click on "NewWindow" btn from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	}
}
