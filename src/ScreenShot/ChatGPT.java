package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChatGPT 
{
 public static void main(String[] args) throws IOException 
 {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("  https://chatgpt.com/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	 File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\chatgpt.png");
	 
	 FileHandler.copy(source, dest);
	
}
}
