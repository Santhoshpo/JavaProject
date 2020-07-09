package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester70 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(200,500);
		driver.manage().window().setSize(dim);
		driver.get("http://qspiders.com/");
		 WebElement nameTextField = driver.findElement(By.id("edit-submitted-name"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",nameTextField);
	}
}
