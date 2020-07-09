//WAST demonstrate the usage of composite actions 

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester9 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement featuresLink = driver.findElement(By.linkText("Features"));
		Actions actions = new Actions(driver);
		actions.moveToElement(featuresLink);
		actions.click(driver.findElement(By.linkText("Add-ons")));//will not work
	//  actions.click(driver.findElement(By.linkText("client")));//will work as it is there in the webpage
		actions.perform();		
	}
}
