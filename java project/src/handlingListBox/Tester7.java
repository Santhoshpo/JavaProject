/*WAST to select and deselect using using various select and deselect methods*/

package handlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester7
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement seleniumListBox = driver.findElement(By.id("manual"));
		Select select = new Select(seleniumListBox);
	
		select.selectByVisibleText("Functional"); Thread.sleep(3000);
		select.deselectByVisibleText("Functional");Thread.sleep(3000);
		
		select.selectByIndex(2);Thread.sleep(3000);
		select.deselectByIndex(2);Thread.sleep(3000);
		
		select.selectByValue("a");Thread.sleep(3000);
		select.deselectByValue("a");Thread.sleep(3000);
		
		driver.close();
	}
}
