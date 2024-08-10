package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword2_EnableFalse 
{
	@Test
	public void TC1()
	{
		org.testng.Reporter.log(" Running TC1",true);
	}
	@Test(enabled = false)
	public void TC2()
	{
		org.testng.Reporter.log(" Running TC1",true);
	}
	@Test(enabled = false)
	public void TC3() 
	{
	Reporter.log("--running TC3--", true);
	}

}
