//WAST verify thetop alignment of username and password textfields-->[Better Approach].

package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester46 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		Rectangle usernameRect = username.getRect();
		Rectangle passwordRect = password.getRect();
		
		int usernameStartY = usernameRect.getY();
		int passwordStartY = passwordRect.getY();
		
		int usernameHeight = usernameRect.getHeight();
		int space = 6;
		int overAllHeight = usernameStartY + usernameHeight + space;
		
		System.out.println("Username Start Y : " + usernameStartY);
		System.out.println("Password Start Y : " + passwordStartY);
		System.out.println("overAllHEight : " + overAllHeight);
		
		if( passwordStartY >= overAllHeight )
		{
			System.out.println("it is not overlapping");
		}
		else
		{
			System.out.println("it is overlapping");
		}
		
		driver.close();
		
	}

}
