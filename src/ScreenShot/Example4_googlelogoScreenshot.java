package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example4_googlelogoScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            
            WebElement logo = driver.findElement(By.xpath(" //img[@ class = 'lnXdpd']"));
            
            File Source = logo.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\logo.png ");
            FileHandler.copy(Source, dest);
            
            
	}
}
