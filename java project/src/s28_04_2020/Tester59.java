/*WAST print the count of rows, columns, data and details of data in the sample home page */
package s28_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester59 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D://html/Tabledata.html");
		WebElement table = driver.findElement(By.id("t1"));
		
		List<WebElement> data = table.findElements(By.tagName("td"));
		System.out.println("Count of data :: "+data.size());
		
		for(WebElement d : data)
		{
			System.out.println(d.getText());
		}		

	}

}
