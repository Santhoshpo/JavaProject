//WAST verify username textfield is empty or not in actitime application.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester35 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String userNameValue = driver.findElement(By.id("username")).getAttribute("value");
		
		if (userNameValue != null)
		{
			if(userNameValue.isEmpty())
			{
				System.out.println("username textfield is empty");
			}
			else
			{
				System.out.println("username textfield is not empty");
			}
		}
		else 
		{
			System.out.println("Attribute is not present");
		}
		
	}

}
