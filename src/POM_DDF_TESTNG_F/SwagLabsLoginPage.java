package POM_DDF_TESTNG_F;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PASS;
	@FindBy(xpath = "//input[@name='login-button']")private WebElement login;
	@FindBy(xpath = "//div[@class='error-message-container error']") private WebElement errorMsg;

	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
	public void Impswaglabsloginpageusername(String username)
	{ 
      UN.sendKeys(username);
	}
	
	public void ImpswaglabsloginpagePassword(String Password)
	{
		PASS.sendKeys(Password);
	}
	public void ImpswagloginpageLogin() 
	{
		login.click();
	}
	public void Veryfyloginlogo()
	{
		if(errorMsg.isDisplayed())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
