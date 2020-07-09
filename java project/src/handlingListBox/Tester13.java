/*WAST select and deselect all options using click method
 */

package handlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester13 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'EmailId')]")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		String xpath = "//span[text()='Desired Career profile' and @class='widgetTitle']/..//span[text()='Edit']";		
		WebElement editLink = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",editLink);
		editLink.click();
		driver.findElement(By.id("locDroppFor")).click();
		driver.findElement(By.partialLinkText("chandigrh")).click();
		}
}
	
