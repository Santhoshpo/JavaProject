//WAST perform double click on "plus" button in skillrary testing app

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester10 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testig-app/product.php?product=selenium-training");
		WebElement addButton = driver.findElement(By.id("id"));
		Actions actions = new Actions(driver);
		actions.doubleClick(addButton).perform();
	}
}
