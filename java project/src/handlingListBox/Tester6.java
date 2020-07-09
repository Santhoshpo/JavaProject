/* WAST verify whether the list box is single select or multi select*/

package handlingListBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester6 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement seleniumListBox = driver.findElement(By.id("manual"));
		Select select = new Select(seleniumListBox);
		if(select.isMultiple())
		{
			System.out.println("This is a multiselect list box");
		}
		else
		{
			System.out.println("This is not a multiselect list box");
		}
		driver.close();
	}
}
