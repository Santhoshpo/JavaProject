//WAST handle file dowload pop up which is opened in selenium using auto it.

package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Basics.BaseSettings;

public class Tester04 extends BaseSettings
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		Runtime run = Runtime.getRuntime();
		run.exec("D://AutoIt/index4.exe");	
	}
}
