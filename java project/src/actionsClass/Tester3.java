/*WAST move to a element based on x and y offsets[offset meaning is co-ordinates] */



package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		WebElement featuresLink = driver.findElement(By.linkText("Features"));
		Dimension dim = featuresLink.getSize();
		int centerX = dim.getWidth()/2;
		int centerY = dim.getHeight()/2;
		
		Actions actions = new Actions(driver);
		actions.moveToElement(featuresLink, centerX, centerY).perform();
	}
}
