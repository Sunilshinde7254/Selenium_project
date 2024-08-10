package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getDataFromWebTable 
{
	public static void main(String[] args) 
	{
       WebDriver driver = new ChromeDriver();
       driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\Table.html");
       String text = driver.findElement(By.xpath("//table//tr[2]/td[2] ")).getText();
       System.out.println(text);
	}
}
