//WAST verify whether "job seeker" color is changing when the mouse is placed on it? 

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import Basics.BaseSettings;

public class Assg1 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/trex/");
		
		WebElement jobSeekerLogin = driver.findElement(By.xpath("//span[.='Jobseeker Login']"));
		String rgbColor = jobSeekerLogin.getCssValue("color");
		String beforeHover = Color.fromString(rgbColor).asHex();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(jobSeekerLogin).perform();
		rgbColor = jobSeekerLogin.getCssValue("color");
		String afterHover = Color.fromString(rgbColor).asHex();
		System.out.println(beforeHover);
		System.out.println(afterHover);
		
		if(beforeHover.equals(afterHover))
		{
			System.out.println("FAILED :: color has not changed ");
		}
		else
		{
			System.out.println("PASSED :: color has been changed");
		}
		
	}
}
