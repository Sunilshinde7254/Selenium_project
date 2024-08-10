//<html>
//<body>
//FN<input type='text' id='1234' name='xyz123'> <br>
//LN<input type='text' id='1234' name='xyz123'> <br>
//</body>
//</html>
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_name
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/name.html");
//enter FN
driver.findElement(By.name("xyz123")).sendKeys("abc");
//enter LN
driver.findElement(By.name("xyz123")).sendKeys("xyz");
}
}