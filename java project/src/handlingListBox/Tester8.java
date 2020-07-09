/*WAST select and deselect all options usig various select and deselect methods */

package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tester8 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/sample.html");
		WebElement seleniumListBox = driver.findElement(By.id("manual"));
		Select select = new Select(seleniumListBox);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options)
		{
			select.selectByVisibleText(option.getText());
			Thread.sleep(3000);
			
		}
		
		for(WebElement option : options)
		{
			select.deselectByVisibleText(option.getText());
			Thread.sleep(3000);
		}
		
		System.out.println("=================================================");
		
		for(WebElement option : options)
		{
			select.selectByValue(option.getAttribute("value"));
			Thread.sleep(3000);
			
		}
		
		for(WebElement option : options)
		{
			select.deselectByValue(option.getAttribute("value"));
			Thread.sleep(3000);
		}
		
		System.out.println("=================================================");
		
		for(int i=0;i<=options.size()-1;i++)
		{
			select.selectByIndex(i);
			Thread.sleep(3000);
			
		}
		
		for(int i=0;i<=options.size()-1;i++)
		{
			select.deselectByIndex(i);
			Thread.sleep(3000);
		}
		
		System.out.println("=================================================");
		
		for(WebElement option : options )
		{
			select.selectByValue(option.getAttribute("value"));
			Thread.sleep(3000);
		}
		
		select.deselectAll();
		Thread.sleep(3000);
		
		driver.close();
	}

}
