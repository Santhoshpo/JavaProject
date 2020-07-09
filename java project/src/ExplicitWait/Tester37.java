//WAST verify whether username textbox is black or not in actitime application.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Tester37 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement username= driver.findElement(By.id("username"));
		String expectedHexaCode = "#000000";
		String colorValue = username.getCssValue("color");
		System.out.println(colorValue);
		String actualHexaCode = Color.fromString(colorValue).asHex();
		System.out.println(actualHexaCode);
		
		if (actualHexaCode.equals(expectedHexaCode))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		driver.close();
		
	}

}
