package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword3_priority2 
{
	@Test(priority = 3)
	public void TC1() 
	{
	Reporter.log("--running TC1--", true);
	}
	@Test(priority = 1)
	public void TC2() 
	{
	Reporter.log("--running TC2--", true);
	}
	@Test(priority = 2)
	public void TC3() 
	{
	Reporter.log("--running TC3--", true);
	} 
	@Test //by default priority = 0
	public void TC4() 
	{
	Reporter.log("--running TC4--", true);
	}
	@Test // duplicate priority = 0
	public void TC5() 
	{
	Reporter.log("--running TC5--", true);
	}
	@Test(priority = -2) //-ve priority 
	public void TC6() 
	{
	Reporter.log("--running TC6--", true);
	}

}
