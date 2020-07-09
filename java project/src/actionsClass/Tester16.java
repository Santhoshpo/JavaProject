//WAST perform conntrol click on features menu link
package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester16 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com");
		WebElement featuresLink = driver.findElement(By.linkText("Features"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(featuresLink).keyUp(Keys.CONTROL).perform();
	}
}
