//WAS to verify username textfield is empty or not in vtiger demo Application 
//and if its non empty print the value in Java console

package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String userNameValue = driver.findElement(By.id("username")).getAttribute("value");
		
		if(userNameValue != null)
		{
			if(userNameValue.isEmpty())
			{
				System.out.println("textfield is empty");
			}
			else
			{
				System.out.println("textfield is not empty");
				System.out.println("username text field contains "+ userNameValue );
			}
		}
		else
		{
			System.out.println("Attribute is not present");
		}
		
		driver.close();
		
		
		
		
	}

}
