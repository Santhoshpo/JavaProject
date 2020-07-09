//WAST perform mouse hovering on the "features" menu and click on Add-ons link.

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester2 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		WebElement features = driver.findElement(By.linkText("Features"));
		Actions actions = new Actions(driver);
		actions.moveToElement(features).perform();
		driver.findElement(By.linkText("Add - ons")).click();
	}
}
