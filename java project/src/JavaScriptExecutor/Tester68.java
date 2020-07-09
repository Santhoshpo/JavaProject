package JavaScriptExecutor;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester68 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		Dimension dim= new Dimension(200,500);
		driver.manage().window().setSize(dim);
		driver.get("https://www.google.com/");
		int a =300;
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+a+",0);");		
	}

}
