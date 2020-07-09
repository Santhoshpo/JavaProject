//WAST enter data into disable textfield

package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester73 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/");
		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("Akash");	
	}
}
