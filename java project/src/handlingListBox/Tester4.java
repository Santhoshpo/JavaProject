/*WAST select all the options one by one using the value of the value attribute of the option
 */
package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basics.BaseSettings;

public class Tester4 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		Select select = new Select(javaListBox);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options)
		{
			select.selectByValue(option.getAttribute("value"));
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeSelected(option));
		}
		driver.close();
	}
}
