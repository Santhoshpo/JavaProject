//WAST to redirect the page to new url without using get and navigate.to()

package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester82 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.facebook.com';");
	}

}
