package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals 
{
	@Test
	public void TC1() 
	{
      String actResult ="HII";
      String exceptResult ="Hello";
      
      Assert.assertEquals(actResult, exceptResult,"Failed both result are differt");
      
	}
}
