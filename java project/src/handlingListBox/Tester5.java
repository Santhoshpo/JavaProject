/*WAST select all the options one by one using index of the options*/

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import Basics.BaseSettings;

public class Tester5 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		
		Select select = new Select(javaListBox);
		List<WebElement> options = select.getOptions();
		
		for(int i=0;i<=options.size()-1;i++)
		{
			select.selectByIndex(i);
		}	
	}
}
