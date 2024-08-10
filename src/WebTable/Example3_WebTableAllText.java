package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_WebTableAllText
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\Table.html");
		String Stringtext = driver.findElement(By.xpath("//body//table")).getText();
		
		System.out.println(Stringtext);
	}


}
