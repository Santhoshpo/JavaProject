package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester69 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		int a=90;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("console.log(arguments[0]);",a);		
	}

}
