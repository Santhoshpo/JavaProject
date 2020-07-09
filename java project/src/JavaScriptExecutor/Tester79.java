//WAST to select the check box without using click()

package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester79 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].checked='true';"	, checkBox);		
	}
}
