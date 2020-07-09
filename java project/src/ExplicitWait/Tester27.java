package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester27 extends BaseSettings
{
	public static void main(String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
//	WebElement loginButton = driver.findElement(By.id("loginButton"));
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
	
	loginButton.click();
	
	}
}

// 1.There are two versions of 
// i) Receives "WebElement" as input
// ii) Receives "By" as Input.

//2. Here until() method returns the WebElement, which was used in the condition
//
//3. we can use the return value & perform action as shown in the above code.



