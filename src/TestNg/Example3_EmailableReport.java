package TestNg;

import org.testng.annotations.Test;

public class Example3_EmailableReport 
{  
  @Test
  public void TC1() 
  {
   org.testng.Reporter.log("Running TC1",true);
  }
  @Test
  public void Tc2() 
  {
	org.testng.Reporter.log("Running Tc2",true);
}
	
}
