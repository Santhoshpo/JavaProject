/* WAST select an option in industry list box of orangeHRM page
*/

package handlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tester11 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement industryListBox = driver.findElement(By.id("Form_submitForm_Industry"));
		
		Select select = new Select(industryListBox);
		select.selectByValue("Computer/Technology-Reseller");	
	}
}
