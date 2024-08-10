package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa2_Mutltiple_Deselection
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\List.html" );
    
    WebElement SelectCountry = driver.findElement(By.xpath("/html/body/select"));
	
	Select s=new Select(SelectCountry);
	  s.selectByValue("Merceders");
      s.selectByVisibleText("BMW");
      s.selectByIndex(2);
	
	Thread.sleep(2000);
	//deselect option
	
	s.deselectByVisibleText("Merceders");
	s.deselectByIndex(2);
	}
	
}

