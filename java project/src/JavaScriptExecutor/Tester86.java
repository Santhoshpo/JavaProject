//WAST find an element using javaScript
package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester86 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginButton = (WebElement) js.executeScript("return document.getElement ById('loginButton');");
		loginButton.click();
	}
}
