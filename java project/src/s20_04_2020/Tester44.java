//WAST verify username & password textfields are aligned properly or not in actitime application.

package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester44 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		int usernameStartX = username.getLocation().getX();
		int passwordStartX = password.getLocation().getX();
		
		System.out.println(usernameStartX);
		System.out.println(passwordStartX);
		
		if (usernameStartX == passwordStartX)
		{
			System.out.println("PASSED :: left alignment is correct");
		}
		else
		{
			System.out.println("FAILED :: left alignment is not correct");
		}
		
		driver.close();

	}

}
