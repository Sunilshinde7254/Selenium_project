package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa1_SingleSelectionBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);

		// Date Selection 
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day'] "));
		Select s1 = new Select(date);
		// s1.selectByIndex(9);
		s1.selectByValue("29");
		System.out.println(s1.getFirstSelectedOption().getText());


		// Month Selection
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month'] "));
		Select s = new Select(month);
		s.selectByVisibleText("Sep");
		// s.selectByValue("9");
		// s.selectByIndex(9);
		System.out.println(s.getFirstSelectedOption().getText());
		
		// Year Selection
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 =new Select(year);
		s2.selectByIndex(9);
		//   s2.selectByValue("2029");
		//s2.selectByValue("2029");
		System.out.println(s2.getFirstSelectedOption().getText());
		
		System.out.println(s.getOptions().size());



	}
}
