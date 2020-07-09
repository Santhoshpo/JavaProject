//WA demo script to understand key up and key down method

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester18 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement username = driver.findElement(By.id("username"));
	
	    Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT);
	//	actions.keyUp(Keys.SHIFT);
		
		Actions actions2 = new Actions(driver);
		actions2.keyUp(Keys.SHIFT).sendKeys(username, "admin").perform();
	//    actions2.keyDown("hi").perform();	
	}
}
