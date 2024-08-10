package POM_DDF_INSTAPAGE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaHomepage 
{
	WebDriver driver;
    WebDriverWait wait;
	@FindBy(xpath = "//div[@class ='x2lah0s x1to3lk4 x1n2onr6 xh8yej3'] ")private WebElement logo;
	@FindBy(xpath = " (//div[@class='x1n2onr6'])[1] ")private WebElement MoreOption;
	//@FindBy(xpath = "//span[contains(text(),'More')]")private WebElement MoreOption;
	@FindBy(xpath = "//div[@class='xu96u03 xm80bdy x10l6tqk x13vifvy']//div[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1] ")private WebElement Logout;
//	@FindBy(xpath = "//span[contains(text(),'Log out')]") private WebElement Logout;


	public InstaHomepage(WebDriver driver) 
	{
		 this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);		
	}

	

	public void InstaClickOnMoreOption()
	{
		wait.until(ExpectedConditions.elementToBeClickable(MoreOption)).click();
	//	MoreOption.click();
	}

	public void InstaLogout()
	{
		 wait.until(ExpectedConditions.elementToBeClickable(Logout)).click();
	//	Logout.click();
	}

	public WebElement getLogo() 
	{
		return wait.until(ExpectedConditions.visibilityOf(logo));
		//return logo;
	}




}
