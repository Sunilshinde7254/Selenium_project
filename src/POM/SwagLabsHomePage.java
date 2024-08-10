package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage
{
	@FindBy(xpath = " //div[text()='Swag Labs']")private WebElement logtext;

	@FindBy(xpath = "//div[@class='bm-burger-button']")private WebElement openmenubar;


	public SwagLabsHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	public void veryfylogo() 
	{
		String actLogoText = logtext.getText();
		String expLogoText = "Swag Labs";
		if(actLogoText.equals(expLogoText))
		{
		System.out.println("TC Pass");
		}
		else
		
		System.out.println("TC Fail");
		
		}
	//
	public void  openmenubar()
	{
		openmenubar.click();
	}
}

