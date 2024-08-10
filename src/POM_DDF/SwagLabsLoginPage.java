package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	@FindBy(xpath = "//input[@id='user-name']") WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private  WebElement PASS;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement login;
	private WebElement errorMsg;

	public SwagLabsLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	public void EnterUN(String Username) 
	{ 
           UN.sendKeys(Username);
	}
	// 
	public void EnterPass(String Password) 
	{
		PASS.sendKeys(Password);
	}
	//
	public void Clicklogin()
	{
		login.click();
	}

	

	
}
