//WAST click on settings Button of pop up(Indus Valley Civilization)
//and click on save button of new pop up in wikipedia

package handlingPopUps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.BaseSettings;

public class Tester11 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en.wikipedia.org/wiki/India");
		WebElement indus = driver.findElement(By.linkText("Indus Valley Civilisation"));
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(indus).pause(Duration.ofSeconds(2)).perform();
		WebElement popUp = driver.findElement(By.xpath("//span[contains(@class,'mw-ui-icon-popups-settings')]"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(popUp));
		Thread.sleep(5000);
		popUp.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();	
	}
}
