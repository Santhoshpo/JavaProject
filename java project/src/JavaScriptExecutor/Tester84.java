//WAST get the window width, height and print it.

package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester84 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long innerWidth = (long) js.executeScript("return window.innerWidth;");
		System.out.println(innerWidth);
		long outerWidth = (long) js.executeScript("return window.outerWidth;");
		System.out.println(outerWidth);
		long innerHeight = (long) js.executeScript("return window.innerHeight;");
		System.out.println(innerHeight);
		long outerHeight = (long) js.executeScript("return window.outerHeight;");
		System.out.println(outerHeight);
	}

}
