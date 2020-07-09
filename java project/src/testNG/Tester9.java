package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tester9 
{
	@Test
	public void login()
	{
		Reporter.log("login to App",true);
		throw new IllegalStateException();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
	}
	
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
	

}
