package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example7_SoftAssertClass 
{
	@Test
	public void TC4() 
	{
	SoftAssert sa=new SoftAssert();
	String actResult="hi";
	String expResult="hello";
	sa.assertEquals(actResult, expResult,"Failed1 -both results are diff ");
	boolean actResult1=false; 
	sa.assertTrue(actResult1, "Failed2: act result if false - ");
	sa.assertAll();
	}

	
}
