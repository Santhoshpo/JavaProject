package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester7 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do/");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		Rectangle usernameRect = username.getRect();
		Rectangle passwordRect = password.getRect();
		
		int usernameStartX = usernameRect.getX();
		int passwordStartX = passwordRect.getX();
		
		int usernameWidth = usernameRect.getWidth();
		int passwordWidth = passwordRect.getWidth();
		
		int allUsernameWidth = usernameStartX + usernameWidth;
		int allPasswordWidth = passwordStartX + passwordWidth;
		
		System.out.println("usernameStartX : " + usernameStartX);
		System.out.println("passwordStartX : " + passwordStartX);
		System.out.println("usernameWidth : " + usernameWidth);
		System.out.println("passwordWidth : " + passwordWidth);
		
		if (allUsernameWidth==allPasswordWidth)
		{
			System.out.println("Right alignment is proper");
		}
		else
		{
			System.out.println("Right alignment is not proper");
		}
		
		driver.close();
	}

}
