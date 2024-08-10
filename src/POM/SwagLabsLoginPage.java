package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	@FindBy(xpath = "//input[@id='user-name']") WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private  WebElement PASS;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement login;

	public SwagLabsLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	public void EnterUN() 
	{ 
           UN.sendKeys("standard_user");
	}
	// 
	public void EnterPass() 
	{
		PASS.sendKeys("secret_sauce");
	}
	//
	public void Clicklogin()
	{
		login.click();
	}
}
