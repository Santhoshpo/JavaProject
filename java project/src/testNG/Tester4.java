package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester4
{
	@Test
	public void m1()
	{
		Reporter.log("This is  a m1 Method",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("This is  a m2 Method",true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("This is  a m3 Method",true);
	}
}
