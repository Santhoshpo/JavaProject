//WAST verify list small window appears after double click in trello

package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.BaseSettings;

public class Assg3 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("username")).sendKeys("nameishemanth@gmail.com");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlToBe("https://trello.com/hemanthrajb/boards"));
		
		driver.navigate().to("https://trello.com/b/essLu5KJ/my-java-sessions");
		
		Actions actions = new Actions(driver);
		actions.moveByOffset(300, 300).doubleClick().build().perform();
		
		try
		{
			//div[@class='no-back']
			WebElement addList = driver.findElement(By.xpath("//span[.='Add List']"));
			System.out.println("Add List small window present in html");
			if(addList.isDisplayed())
			{
				System.out.println("Add List small window is displayed");
			}
			else 
			{
				System.out.println("Add list small window is not displayed");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Add List small window is not present in html, so not displayed");
			e.printStackTrace();
		}	
	}
}
