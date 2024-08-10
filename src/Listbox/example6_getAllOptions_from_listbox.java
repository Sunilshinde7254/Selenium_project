package Listbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class example6_getAllOptions_from_listbox
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\sunil\\OneDrive\\Desktop\\List.html" );
	    
	    WebElement SelectCountry = driver.findElement(By.xpath("/html/body/select"));
		Select s=new Select(SelectCountry);
		
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement s1:allOptions)
		{
			System.out.println(s1.getText());
		}
		
	   
		
		
	}
}