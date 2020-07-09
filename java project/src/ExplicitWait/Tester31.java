//WAST verify whether page is loaded or not within 30 seconds [page load timeout]

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester31 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://demo.actitime.com/");
			driver.findElement(By.id("loginButton")).click();
			System.out.println("Application loaded within 3o seconds");
		}
		catch(Exception e)
		{
			System.out.println("Application didn't load with in 30 seconds");
		}
		finally
		{
			driver.close();
		}
	}

}
