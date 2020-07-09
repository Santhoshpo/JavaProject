//WAST clear the contents from username textfield in Vtiger demo application.[Tester 14]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester31 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("Mohan");
	}

}
