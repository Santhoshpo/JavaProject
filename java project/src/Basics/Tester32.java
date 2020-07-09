//WAST remove the contents from the username textfield without using clear() in vtiger application.[Tester 15] 

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester32 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(Keys.CONTROL+"a");
		userName.sendKeys(Keys.DELETE);
		userName.sendKeys("Mohan");

	}

}
