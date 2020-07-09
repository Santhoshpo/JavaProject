package testNG;
//Parallel  execution at Test Case Level using data provider

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester13
{
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] arr = new Object[3][2];
		
		
		arr[0][0]="admin";
		arr[0][1]="manager";
		
		arr[1][0]="userB";
		arr[1][1]="tester123";
		
		arr[2][0]="trainee";
		arr[2][1]="trainee";
		
		return arr;		
	}
	
	@Test(dataProvider="getData")
	public void login(String u, String p) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(u);
		driver.findElement(By.name("pwd")).sendKeys(p);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
	

}
