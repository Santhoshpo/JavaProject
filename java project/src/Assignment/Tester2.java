//WAS to check whether the keepmelogged in check box of actitime is empty or not

package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester2 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInLabel"));
		
		if(checkBox.getText().isEmpty())
			{
				System.out.println("checkbox is empty");
			}
			else
			{
				System.out.println("checkbox is not empty");
			}
		
		
		driver.close();
		
	}

}