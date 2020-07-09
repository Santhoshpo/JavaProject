package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester5 
{
	@Test(priority=3)
	public void m1()
	{
		Reporter.log("This is  a m1 Method",true);
	}
	
	@Test(priority=2)
	public void m2()
	{
		Reporter.log("This is  a m2 Method",true);
	}
	
	@Test(priority=1)
	public void m3()
	{
		Reporter.log("This is  a m3 Method",true);
	}

}
