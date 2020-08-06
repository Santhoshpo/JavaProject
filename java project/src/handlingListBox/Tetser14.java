//WAST select and deselect all options of desired locations in naukri(update profile section)
package handlingListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tetser14 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'EmailId')]")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		 List<WebElement> options = driver.findElement(By.id("ul_locDroope")).findElements(By.tagName("a"));
		for(WebElement option : options)
		{
			option.click();
			Thread.sleep(2000);
			option.click();
			Thread.sleep(2000);
		}
	}
}