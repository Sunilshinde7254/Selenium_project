package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.node.config.DriverServiceSessionFactory;

public class Ex3 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://ui.vision/demo/webtest/frames/ ");
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html'] "));
		// farme1
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1'] ")).sendKeys("Welcome");

		//frame2 
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html'] "));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2'] ")).sendKeys("Welcome");

		// frame3 
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html'] "));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath(" //input[@name='mytext3']")).sendKeys("Welcome");

		// Inner frame 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(" //div[@id='i8'] //div[@class=' AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();

		// frame 4
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath(" //input[@name='mytext4']")).sendKeys("Welcome");






	}
}
