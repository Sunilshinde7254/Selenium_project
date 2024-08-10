package POM_DDF_INSTAPAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instaloginpage 
{
	@FindBy(xpath = "//input[@name='username'] ")private WebElement UN;
	@FindBy(xpath ="//input[@name='password'] ")private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit'] ")private WebElement LOGIN;


	public Instaloginpage(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void InstaUsername(String username) 
	{
	  	UN.sendKeys(username);
	}
	public void InstaPassword(String password)
	{
	 PASS.sendKeys(password);	
	}
	public void Instalogin()
	{
		LOGIN.click();
	}

	public RemoteWebDriver getLogo() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
