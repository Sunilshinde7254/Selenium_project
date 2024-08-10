package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoSS 
{
	public static void main(String[] args) throws IOException 
	{
      WebDriver driver = new ChromeDriver();
      driver.get(" https://www.facebook.com/");
      
     WebElement logo = driver.findElement(By.xpath("//button[@value='1']"));
     
     File source=logo.getScreenshotAs(OutputType.FILE);
     System.out.println(source);
     
     File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\demofblogo.png");
     org.openqa.selenium.io.FileHandler.copy(source, dest);
     
	}
}
