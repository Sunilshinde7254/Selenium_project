package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginpage
{
	@FindBy(xpath = " //input[@id='email']") private WebElement Phnumber;
	@FindBy(xpath = " //input[@id='pass']") private WebElement Pass;
	@FindBy(xpath = " //button[@name='login']") private WebElement loginbtn;


	public FaceBookLoginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Username
	public void Username() 
	{
		Phnumber.sendKeys("9665167254");
	}
	// PAssword
	public void EnterPassword()
	{
       Pass.sendKeys("Sunil@123");
	}
	// Login button
	public void Clicklogin_button()
	{
       loginbtn.click();
	}


}
