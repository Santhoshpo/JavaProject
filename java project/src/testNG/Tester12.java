package testNG;
//Parallel execution at TestCase Level

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tester12 
{
	@Test(invocationCount=2,threadPoolSize=2)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");	
	}
}
