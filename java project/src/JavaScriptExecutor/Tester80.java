//WAST to select the radio button without using click()
package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester80 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement radioButton = driver.findElement(By.name("sex"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].checked='true';"	, radioButton);		
	}
} 
