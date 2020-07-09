package JavaScriptExecutor;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester66 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		Dimension dim= new Dimension(200,500);
		driver.manage().window().setSize(dim);
		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollBy(0,-500);");
	}

}
