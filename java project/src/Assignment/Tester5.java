//WAST verify whether vertical alignment of username and password is proper or not?

package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester5 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userName = driver.findElement(By.id("username"));
		int heightOfUsernameTF = userName.getSize().getHeight();
		Point userNamePoint = userName.getLocation();
		int startOfUsername = userNamePoint.getY();
		int endOfUsername = startOfUsername + heightOfUsernameTF;
		System.out.println("Username TextField of Y co-ordinate start = " + startOfUsername);
		System.out.println("Username TextField of Y co-ordinate end = " + endOfUsername);
		
		System.out.println();
		
		WebElement password = driver.findElement(By.name("pwd"));
		int heightOfpasswordTF = password.getSize().getHeight();
		Point passwordPoint = password.getLocation();
		int startOfPassword = passwordPoint.getY();
		int endOfPassword = startOfPassword + heightOfpasswordTF;
		System.out.println("Password TextField of Y co-ordinate start = " + startOfPassword);
		System.out.println("Password TextField of Y co-ordinate end = " + endOfPassword);
		
		if(endOfUsername < startOfPassword )
		{
			System.out.println("username textfield is not overlapping");			
		}
		else
		{
			System.out.println("username textfield is overlapping");
		}
		
		driver.close();
	}

}
