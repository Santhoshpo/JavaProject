package testNG;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester10 
{
	@Parameters({"subject"})
	@Test
	public void login(@Optional("java")String sub )
	{
		Reporter.log("login to App = "+sub,true);
	}
}
