//WAST movetoelement in monster india app's more drop down menu
package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester7 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/trex/");
		WebElement moreMenu = driver.findElement(By.xpath("//li[@mindex='4']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(moreMenu, 19, 27).perform();;	
	}
}
