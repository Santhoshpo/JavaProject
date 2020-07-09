/*WAST select all the days of the days dropdown in birthday selection of facebook
 */

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tester10
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select select = new Select(dayDropDown);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options )
		{
			select.selectByVisibleText(option.getText());
		}
		
		driver.close();
	}
}
