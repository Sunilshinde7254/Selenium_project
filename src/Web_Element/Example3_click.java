package Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);

		//click on male radio btn
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();

		// select date of birth

		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_month'] "));
		System.out.println(element);

		Select set = new Select(element);
		// set.selectByVisibleText("Sep");
		//   set.selectByIndex(8);
		set.selectByValue("9");

		// Select year of next MPS election

		WebElement element1 = driver.findElement(By.xpath("//select[@name='birthday_year'] "));

		Select set1 = new Select(element1);
		set1.selectByIndex(8);
		//set1.selectByValue();

		
		// Already have an account
		driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();


	}
}
