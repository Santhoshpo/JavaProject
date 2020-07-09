package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester10 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of Radio Buttons :: "+ radioButton.size());
		
		for (int i= radioButton.size()-1;i>=0;i--)
		{
			radioButton.get(i).click();
			if(radioButton.get(i).isEnabled())
			{
				System.out.println("Radio Button is Enabled :: "+i);
			}
			else
			{
				System.out.println("Radio Button is not Enabled :: "+i);
			}
			
		}
		driver.close();

	}

}
