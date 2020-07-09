//WAST click on login button of actitime using sendkeys().[Tester 13]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester30 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		driver.close();
	}

}
