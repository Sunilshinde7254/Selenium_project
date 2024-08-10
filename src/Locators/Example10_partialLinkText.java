package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_partialLinkText
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
//driver.get("file:///D:/3rd%20Ferb%2023/Selenium%20Notes/Html%20files/linkText_PartialLinkText.html");
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.partialLinkText("book")).click();
}
}