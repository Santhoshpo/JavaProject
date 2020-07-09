//WAST perform drag and drop operation from source element to destination element in trello

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.BaseSettings;

public class Tester13 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		Thread.sleep(8000);//To wait for password to disappear
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlToBe("https://trellocom/hemanthrajb/boards"));
		driver.navigate().to("https://trello.com/b/essLu5KJ/my-java-sessions");
		WebElement listItem = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		WebElement thingsToDoCard = driver.findElement(By.xpath("//textarea[.=\"Thing to do\"]/../..//span[.='Add a card']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(listItem, thingsToDoCard).perform();
	}
}