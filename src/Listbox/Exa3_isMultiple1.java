package Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Exa3_isMultiple1
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on "Create new account" link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(3000);
				
				WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
				
				Select s=new Select(month);
				boolean result = s.isMultiple();
				System.out.println(result);
				if (result) 
				{
					System.out.println("Listbox is of multi-selectable");
				} 
				else 
				{
					System.out.println("Listbox is of single-selectable");
				}
	}
}