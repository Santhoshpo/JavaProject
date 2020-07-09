//WAST login and logout from actitime application without using "implicit wait","explicit wait" and 
// "Thread.sleep()". [ Custom wait]

package ExplicitWait;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester29 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		while(true) // for(;;)
		{
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Element not present");
				
			}
						
		}

	}

}
