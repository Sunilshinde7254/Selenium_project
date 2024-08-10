package Listbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class example5_getAllSelectedOptionsSize_From_MultiSelectableListbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\List.html" );
	    
	    WebElement SelectCountry = driver.findElement(By.xpath("/html/body/select"));
		Select s=new Select(SelectCountry);
		s.selectByIndex(3);
		s.selectByIndex(2);
		s.selectByIndex(1);
		
		// List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		// System.out.println(allSelectedOptions.size());
		
		int size = s.getAllSelectedOptions().size();
		System.out.println(size);
		
		System.out.println(s.getAllSelectedOptions().size());
	}
}
