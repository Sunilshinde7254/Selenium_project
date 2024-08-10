package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_Sample1_TestSuite 
{
	@Test
	public void TC1()
	{
		Reporter.log("--Ruuing Tc1",true);
	}

	@Test
	public void TC2()
	{
		Reporter.log("--Ruuing Tc2",true);
	}

	@Test
	public void TC3()
	{
		Reporter.log("--Ruuing Tc3",true);
	}

}
