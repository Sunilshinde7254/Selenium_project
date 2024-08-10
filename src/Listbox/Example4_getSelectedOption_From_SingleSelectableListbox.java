package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectedOption_From_SingleSelectableListbox

{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
		Select s = new Select(month);
	//	s.selectByIndex(0);
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
