package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Example4_Annotations 
{
	@BeforeClass
	public static  void openBrowser() 
	{
	Reporter.log("----------open Browser-----------",true);
	}


	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--------Login Methid--------------",true);
	}
	
	@Test
	public void VerifyLogo2() 
	{
	Reporter.log("--Running Verify Logo2 TC--", true);
	}
	@Test
	public void VerifyLogo1() 
	{
	Reporter.log("--Running Verify Logo1 TC--", true);
	}
	@AfterMethod
	public void logoutFromApp()
	{
	Reporter.log("--logout From App--",true);
	}
	@AfterClass
	public static void closeBrowser() 
	{
	Reporter.log("----------close Browser-----------",true);
	}


}
