package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester1 
{
	
	@Test	
	public void m1()
	{
		Reporter.log("This is a mi Method",true);
	}
}
