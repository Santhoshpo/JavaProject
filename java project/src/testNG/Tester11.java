package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tester11
{
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("login to App",true);
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("logout from App",true);
	}
	@Test(groups= {"customer","smoke"})
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
	}
	@Test(groups= {"customer"})
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
	@Test(groups= {"project","smoke"})
	public void createProject()
	{
		Reporter.log("Create Project",true);
	}
	@Test(groups= {"project"})
	public void deleteProject()
	{
		Reporter.log("Delete Project",true);
	}
	
}
