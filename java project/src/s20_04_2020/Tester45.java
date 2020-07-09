//WAST verify the top alignment of username & password textfield in actitime?

package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester45 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int usernameStartY = username.getLocation().getY();
		int passwordStartY = password.getLocation().getY();
		
		int userNameHeight = username.getSize().getHeight();
		int space = 6;
		int overAllHeight = usernameStartY + userNameHeight + space;
		
		System.out.println("Username Start Y : "+ usernameStartY);
		System.out.println("Password Start Y : "+ passwordStartY);
		System.out.println("overAllHeight : "+ overAllHeight);
		
		if ( passwordStartY >= overAllHeight )
		{
			System.out.println("It is not overlapping");
		}
		else
		{
			System.out.println("It is overlapping");	
		}
		
		driver.close();
		
		}
}

