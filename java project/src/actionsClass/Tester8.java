//WAST move mouse pointer to any location in trello board page

package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.BaseSettings;

public class Tester8 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		Thread.sleep(8000);//to wait for the password to disappear
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login_submit")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlToBe("https://trello.com/hemanthrajb/boards"));
		driver.navigate().to("https://trello.com/blessLu5KJ/my-java-sessions");
		Actions actions = new Actions(driver);
		actions.moveByOffset(300, 300).doubleClick().build().perform();//Build method is optional because perform 
																//method will cal it automatically
	}
}
