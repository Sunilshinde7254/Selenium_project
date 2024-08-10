package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword3_priority1 
{
	@Test(priority = 3)
	public void TC1()
	{
		Reporter.log(" Running TC1",true); 
	}
	@Test(priority = 3)
	public void TC2()
	{
		Reporter.log(" Running TC2",true); 
	}
	@Test(priority = 3)
	public void TC3()
	{
		Reporter.log(" Running TC3",true); 
	}


}
