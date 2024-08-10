package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_ScrollUpDown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
          ChromeDriver driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
          Thread.sleep(2000);
          
          WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        		   
        		   Actions act=new Actions(driver);
        		   act.scrollToElement(signUp).perform();

	}
}
