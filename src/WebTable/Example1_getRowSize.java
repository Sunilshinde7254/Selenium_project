package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize 
{
	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\Table.html");
      int rowsize = driver.findElements(By.xpath(" //table//tr")).size();
      System.out.println(rowsize);
      
	}

}
