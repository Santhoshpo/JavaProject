//WAST move to element in luxire app's account dropdown menu
package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester6 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luxire.com/");
		Thread.sleep(10000);
		WebElement actionsMenu = driver.findElement(By.linkText("Account"));
		Actions actions = new Actions(driver);
		actions.moveToElement(actionsMenu, 23, 11).perform();;
	}
}
