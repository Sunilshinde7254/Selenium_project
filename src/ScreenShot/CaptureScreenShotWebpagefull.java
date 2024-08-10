package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShotWebpagefull 
{
	public static void main(String[] args) throws IOException 
	{
        ChromeDriver driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
      
//        File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		  System.out.println(Source);
		  
        File source = driver.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        
        
        File dest =new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\utube3.png");
        
        org.openqa.selenium.io.FileHandler.copy(source, dest);
        
        
	}
}
