//<html>
//<body>
//<a href='https://www.facebook.com/'>facebook</a>
//</body>
//</html>
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_linkText
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/linkText_PartialLinkText.html");
Thread.sleep(3000);
driver.findElement(By.linkText("facebook")).click();
}
}
