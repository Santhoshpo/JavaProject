package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester8 
{
	@Test
	public void createUser()
	{
		Reporter.log("Create User",true);
	}
	@Test(enabled=false)
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}

}
