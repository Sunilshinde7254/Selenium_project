package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword5_dependsOnMethod2 
{
	@Test
	public void login()
	{
		Reporter.log("Running login 1",true);
	}

	@Test
	public void login2()
	{
		Reporter.log("Running login2",true);
	}
	
	@Test(dependsOnMethods = {"login","login2"})
	public void logout()
	{
		Reporter.log("Running logout",true);
	}
	
	

}
