package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectedOption_From_MultiSelectableListbox

{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\List.html" );
	    
	    WebElement SelectCountry = driver.findElement(By.xpath("/html/body/select"));
		
		Select s = new Select(SelectCountry);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);

//		WebElement selectedOption = s.getFirstSelectedOption();
//		String text = selectedOption.getText();
//		System.out.println(text);
//		
//		String text1 =s.getFirstSelectedOption().getText();
//		System.out.println(text1);

		System.out.println(s.getFirstSelectedOption().getText());
		




	}
}
