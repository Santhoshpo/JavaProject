/*WAST print the count of rows columns and data in the sample homepage*/
package s28_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester58 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D://html/Tabledata.html");
		WebElement table = driver.findElement(By.id("t1"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Count of Rows :: "+rows.size());
		
		List<WebElement> columns = table.findElements(By.tagName("th"));
		System.out.println("Count of columns :: "+columns.size());
		
		List<WebElement> data = table.findElements(By.tagName("td"));
		System.out.println("Count of data :: "+data.size());
		
	}

}
