//WAST get the Attribute of an element and print it using JavaScript
package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester85 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement textEle = driver.findElement(By.id("username"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String classText = (String) js.executeScript("return arguments[0].getAttribute('class');",textEle );
		System.out.println(classText);	
	}
}
