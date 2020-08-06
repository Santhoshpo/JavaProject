package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tester1 
{
	@Parameters({"browser","port"})
	@Test
	public void test(@Optional("chrome")String browser,@Optional("4446") String port) throws MalformedURLException, InterruptedException
	{
		URL url = new URL("http://192.168.43.227:"+port+"/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
