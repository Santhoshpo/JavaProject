//Script by using attributeToBe() and WebElement 

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester23 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		boolean result= wait.until(ExpectedConditions.attributeToBe(username, "class", "textField"));
		
		System.out.println(result);
		driver.close();

	}

}
