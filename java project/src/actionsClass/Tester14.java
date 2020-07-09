package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Tester14 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://trello.com/login");
	driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
	Thread.sleep(8000);
	driver.findElement(By.id("login")).click();
	driver.findElement(By.id("password")).sendKeys("Testing@123");
	driver.findElement(By.id("login-submit")).click();
	WebElement listItem = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
	WebElement thingToDoCard = driver.findElement(By.xpath("//textarea[.='Things To Do']/../..//span[.='Add a Card']"));
	Actions actions = new Actions(driver);
	actions.clickAndHold(listItem).moveToElement(thingToDoCard).pause(Duration.ofSeconds(5)).release().perform();
	}
}
