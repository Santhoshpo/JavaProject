//WAST Identify collection of elements
package JavaScriptExecutor;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester87 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		@SuppressWarnings("unchecked")
		List<WebElement> genders = (List<WebElement>) js.executeScript("return document.getElementsByName('sex');");
		
		for(WebElement gender : genders)
		{
			System.out.println(gender.getAttribute("value"));
		}	
	}
}
