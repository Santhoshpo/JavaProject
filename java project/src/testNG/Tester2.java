package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester2 
{
	@Test(invocationCount=5)
	public void m1()
	{
		Reporter.log("This is a m1() Method", true);
	}
}
