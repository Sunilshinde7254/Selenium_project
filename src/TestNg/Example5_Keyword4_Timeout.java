package TestNg;

import org.testng.annotations.Test;

public class Example5_Keyword4_Timeout 
{
	@Test(timeOut = 5000)
 public void TC1() throws InterruptedException
 {
	 Thread.sleep(2000);
	 
	 org.testng.Reporter.log(" Rinning test case",true);
	 
 }
}
