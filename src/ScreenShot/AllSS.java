package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSS 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\demofb.png");
		
		
		org.openqa.selenium.io.FileHandler.copy(source, dest);
	
		


		  


	}
}
