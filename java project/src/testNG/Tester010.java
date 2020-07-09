package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester010
{
	@Parameters({"browser"})
	@Test
	public void login(@Optional ("chrome") String browser)
	{
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		else
		{
			throw new IllegalStateException("only chrome and Firefox is supported");
		}
		
		driver.get("https://www.google,com");
		driver.close();
	}
}
