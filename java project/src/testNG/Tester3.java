package testNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester3 {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] arr=new Object[3][2];
		
		arr[0][0] = "userA";
		arr[0][1] = 123;
		
		arr[1][0] = "userA";
		arr[1][1] = 456;
		
		arr[2][0] = "userA";
		arr[2][1] = 789;
		
		return arr;
	}
	
	@Test(dataProvider="getData")
	public void createUser(String un, int pwd)
	{
		Reporter.log("create user::"+un+"::"+pwd,true);
	}

}
