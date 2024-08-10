package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Sample2 
{
	@Test(groups = "Setting")
	public void TC5() 
	{
	Reporter.log("--running TC5--", true);
	}
	@Test(groups = "Profile")
	public void TC6() 
	{
	Reporter.log("--running TC6--", true);
	}
	@Test(groups = "Profile")
	public void TC7() 
	{
	Reporter.log("--running TC7--", true);
	}
	@Test(groups = "Fund")
	public void TC8() 
	{
	Reporter.log("--running TC8--", true);
	}

}
