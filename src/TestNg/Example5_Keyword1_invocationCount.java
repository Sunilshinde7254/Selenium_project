package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword1_invocationCount 
{
	@Test(invocationCount = 10)
 public void TC1() 
 {
	Reporter.log(" Running Test Case",true);
}
}
