package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_CaptureScreenShot
{
	public static void main(String[] args) throws IOException 
	{
        ChromeDriver driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
       WebElement logo = driver.findElement(By.xpath("(//div[@class='style-scope ytd-feed-nudge-renderer'])[7] "));
       
        File source = logo.getScreenshotAs(OutputType.FILE);
        
        System.out.println(source);
        
        File dest =new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\utube2.png");
        
        org.openqa.selenium.io.FileHandler.copy(source, dest);
        
        
	}
}
