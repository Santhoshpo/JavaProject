//WAST move to the different co-ordinates of the same element 

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester5 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement featuresLink = driver.findElement(By.linkText("Features"));
		Dimension dim = featuresLink.getSize();
		int centerX = dim.getWidth()/2;
		int centerY = dim.getHeight()/2;
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(featuresLink, centerX-30, centerY).perform();
	}
}
