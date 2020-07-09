//WAST verify whether the error message is displayed in red or not?

package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import Basics.BaseSettings;

public class Tester6 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
		
		String expectedOfHexacode = "#ce0100";
		String colorValue = errorMessage.getCssValue("color");
		System.out.println(colorValue);

		String actualHexaCode = Color.fromString(colorValue).asHex();
		System.out.println(actualHexaCode);
		
		if(actualHexaCode.equals(expectedOfHexacode))
		{
			System.out.println("error message is in red color");
		}
		else
		{
			System.out.println("error message is not in red color");
		}
		driver.close();
				
				
	}

}
