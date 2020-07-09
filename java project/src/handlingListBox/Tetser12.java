/*WAST select all options by using click method*/

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tetser12 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		Select select = new Select(javaListBox);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options)
		{
			option.click();
			Thread.sleep(3000);
		}
		driver.close();
	}

}
