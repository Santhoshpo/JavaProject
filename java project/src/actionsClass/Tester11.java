//WAST drag and drop operation

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester11 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");

		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block1, block2).perform();			
	}
}
