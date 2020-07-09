//WAST perform right click on a element

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tetser15 
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
		driver.navigate().to("https://trello.com/b/essLu5KJ/my-java-sessions");
		WebElement listItem = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']"));
		Actions actions = new Actions(driver);
		actions.contextClick(listItem).perform();
		driver.findElement(By.xpath("//span[.='Edit Labels']")).click();	
	}
}
