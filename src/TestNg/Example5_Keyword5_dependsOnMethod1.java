package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword5_dependsOnMethod1 
{
	@Test
  public void Login()
  {
	Reporter.log("------Running login Test Case------",true);   
  }
	@Test(dependsOnMethods = {"Login"})
	public void logout()
	{
		Reporter.log("--Running Logout--------",true);
	}
}
