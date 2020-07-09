/*WAST perform the following operations
 * i) print the total count of operations
 * ii) print the options visible text
 */

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tetser1 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		Select select = new Select(javaListBox);
		List<WebElement> options = select.getOptions();
		System.out.println("The count of options is :: "+options.size());
		for(WebElement option : options )
		{
			System.out.println(option.getText());
		}
		driver.close();
	}
}
