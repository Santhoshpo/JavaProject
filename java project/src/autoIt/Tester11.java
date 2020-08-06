//WAST disable notifications pop up in firefox

package autoIt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Tester11 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) 
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("permissions.default.desktop-nitifications", false);
		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.cleartrip.com/");
		
		
	}

}
