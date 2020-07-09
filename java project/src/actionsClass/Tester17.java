//WAST control click on the menu links(multiple links)
package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester17 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com");
		List<WebElement> menuLinks = driver.findElements(By.xpath("//Ul[@class='main-menu-ul']/li/a"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		for(WebElement menuLink : menuLinks)
		{
			actions.click(menuLink);
			
		}
		actions.keyUp(Keys.CONTROL);
		actions.perform();	
	}
}
