package ExplicitWait;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester30 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		int i=1;
		while(i<=15) // for(int i=1;i<=15;i++)
		{
			System.out.println("CYCLE NO :: "+i);
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Element not present");
				
			}
			
			i++;
		}
		
		driver.close();

	}

}
