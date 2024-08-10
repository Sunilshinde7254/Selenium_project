package POM_DDF_TESTNG_F;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsOpenMenuPage 
{
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement logout;

	public SwagLabsOpenMenuPage(WebDriver driver)
	{
          PageFactory.initElements(driver, this);
	}
	
	
	public void clickSwagLabsOpenMenuPageLogout()
	{
	 logout.click();	
	}
}
