package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1_CapturescreenShotWebpage 
{
	
	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  
		  // InterfaceDown Casting
		  // TakesScreenshot is inteface
		  File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  System.out.println(Source);
		  
		  File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\demo.png");
		  
		  FileHandler.copy(Source, dest);
		
		
		  
	}
 
}
