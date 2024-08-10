//<html>
//<body>
//FN<input type='text' id='1234'> <br>
//LN<input type='text' id='1234'> <br>
//</body>
//</html>
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_ID
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/ID.html");
//enter FN
driver.findElement(By.id("1234")).sendKeys("abc");
//enter LN
driver.findElement(By.id("1234")).sendKeys("xyz");
}
}
