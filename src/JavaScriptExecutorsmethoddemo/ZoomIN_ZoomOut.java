package JavaScriptExecutorsmethoddemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIN_ZoomOut 
{
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver = new ChromeDriver();
     driver.get("www.opencart.com");
     Thread.sleep(5000);
     driver.manage().window().minimize();
     Thread.sleep(5000);
     driver.manage().window().maximize();
     
     
     // using java script approach zoom 
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeAsyncScript("document.body.style.zoom='50%'");
	} 
}
