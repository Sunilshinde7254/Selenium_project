package POM_DDF_TESTNG_F;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage
{
  
	@FindBy(xpath = "//div[text()='Swag Labs'] ")private WebElement logotext;
	@FindBy(xpath = "//div[@class='bm-burger-button'")private WebElement openmenubutton;
	
	
	public SwagLabsHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getSwagLabsHomePageLogoText() 
	{
        String text = logotext.getText();
        return text;
	}
	
	public void clickswaglaghomepageopenmenu_button() 
	{
		openmenubutton.click();
	}
}
