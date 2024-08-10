package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass5 
{
	@Test
	public void TC4() 
	{
	String actResult="hi";
	String expResult="hello";
	Assert.assertEquals(actResult, expResult,"Failed1 -both results are diff ");
	boolean actResult1=false; 
	Assert.assertTrue(actResult1, "Failed2: act result if false - ");
	}

}
