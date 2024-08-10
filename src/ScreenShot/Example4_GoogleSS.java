package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example4_GoogleSS 
{
	public static void main(String[] args) throws IOException 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      
      
     File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     File des = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\google2.png");
     
     FileHandler.copy(Source, des);
     
      
      
	}
}
