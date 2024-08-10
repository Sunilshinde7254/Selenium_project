package Handling_Autosugestion;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch_AutosugestDropdown_redmi 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//enter mobile name
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);
	//	List<WebElement> list = driver.findElements(By.xpath(" //ul[@role='listbox']//li//div[@role='option']"));
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));
		String expText="redmi";
		
		for(WebElement s1:allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}
	}
}