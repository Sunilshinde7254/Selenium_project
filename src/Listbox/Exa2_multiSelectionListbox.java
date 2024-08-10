package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exa2_multiSelectionListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
          WebDriver driver = new ChromeDriver();
          
          driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\List.html" );
          
          WebElement SelectCountry = driver.findElement(By.xpath("/html/body/select"));
          
          Select s = new  Select(SelectCountry);
          // Selcted 
          s.selectByValue("Merceders");
          s.selectByVisibleText("BMW");
          s.selectByIndex(4);
          s.selectByIndex(2);
          s.selectByIndex(3);
          System.out.println(s.getFirstSelectedOption().getText());
          
          
         
          
          // deselected 
          Thread.sleep(2000);
          s.deselectAll();
          // True False
          boolean result = s.isMultiple();
          if(result)
          {
        	  System.out.println("Multiple Selection possible");
          }
          else
          {
        	  System.out.println("Multiple selection not possible");
          }
         // System.out.println(result);
          
          
	}
}
