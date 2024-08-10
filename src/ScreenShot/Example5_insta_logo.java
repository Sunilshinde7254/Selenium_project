package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example5_insta_logo 
{
	public static void main(String[] args) throws IOException 
	{
       WebDriver driver = new ChromeDriver();
       
       driver.get(" https://www.instagram.com/accounts/login/");
       WebElement logo = driver.findElement(By.xpath("//i[@data-visualcompletion=\"css-img\"] "));
       
       
       File Src = logo.getScreenshotAs(OutputType.FILE);
//       File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\insta.png ");
//       FileHandler.copy(Src, dest);
       
       File dest = new File("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\ScreenShot\\logoinsta.pdf ");
       FileHandler.copy(Src, dest);
       
       
       
       
       
       
     

	}
}
