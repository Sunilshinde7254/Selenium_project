package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2_LogoScreenShot 
{
	public static void main(String[] args) throws IOException {
       
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebElement logo = driver.findElement(By.xpath("// img[@class='fb_logo _8ilh img']"));
		  
		  File src = logo.getScreenshotAs(OutputType.FILE);
		  
		
		  
		  File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\demo1.png");
		  
		  FileHandler.copy(src, dest);
	} 
}
