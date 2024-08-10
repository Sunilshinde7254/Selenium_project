package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exa1_HiddenDivision_popup 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.nobroker.in/");

		driver.findElement(By.xpath("(//div[text()='Log in'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'signUp-phoneNumber'] ")).sendKeys("9665167254");
		
		

	}
}
