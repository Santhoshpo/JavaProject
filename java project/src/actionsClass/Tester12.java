//WAST perform drag and drop operation from source element to destination location.

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester12 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(block3, 0, 300).perform();	
	}
}
