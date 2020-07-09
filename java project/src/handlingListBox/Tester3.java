/*WAST select all the options using the text of the options
 */

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		Select select = new Select(javaListBox);
		List<WebElement> options = select.getOptions();
		for(WebElement option : options)
		{
			select.selectByVisibleText(option.getText());
			Thread.sleep(3000);
		}
		driver.close();
	}
}
