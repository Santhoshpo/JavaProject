/*WAST perform following operations
 * select alternative options of multiselect
 * prit all the selected options
*/

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tester9 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement seleniumListBox = driver.findElement(By.id("manual"));
		Select select = new Select(seleniumListBox);
		List<WebElement> options = select.getOptions();
		
		for(int i=0;i<=options.size()-1;i+=2)
		{
			select.selectByIndex(i);
		}
		
		List<WebElement> all = select.getAllSelectedOptions();
		
		for(WebElement option : all)
		{
			System.out.println(option.getText());
		}
		
		driver.close();
		
	}

}
