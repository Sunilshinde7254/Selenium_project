//<html>
//<body>
//FN<input type='text' id='1234' name='xyz123' class='abc123'> <br>
//LN<input type='text' id='1234' name='xyz123' class='abc123'> <br>
//</body>
//</html>
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_className
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/className.html");
//enter FN
driver.findElement(By.className("abc123")).sendKeys("abc");
//enter LN
driver.findElement(By.className("abc123")).sendKeys("xyz");
driver.findElements(By.className(""));
}
}
