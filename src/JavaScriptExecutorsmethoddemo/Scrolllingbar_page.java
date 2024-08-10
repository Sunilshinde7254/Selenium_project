package JavaScriptExecutorsmethoddemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolllingbar_page 
{
	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
      
       driver.get("https://www.youtube.com/watch?v=-g-mhZJQj9E&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=13");
       JavascriptExecutor js = (JavascriptExecutor)driver;
       
       
       //1  Scroll down page by pixel number
       js.executeScript("window.scrollBy(0,3000)"," ");
       System.out.println(js.executeScript(" return window .pageYOffset;"));
       
       // 2 Scroll down by till end of the page 
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       System.out.println(js.executeScript(" return window .pageYOffset;"));
    	
       // 3 scroll by initial stage
       js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
       System.out.println(js.executeScript(" return window .pageYOffset;"));
    	
	}
}
