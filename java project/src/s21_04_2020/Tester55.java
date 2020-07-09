//Total count of links in Actitime application + we should print the link text?

package s21_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester55 extends BaseSettings
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total count is :: " + links.size());
		System.out.println("==================================");
		for (int i=0;i<=links.size()-1;i++)
		{
			System.out.println(links.get(i).getText());//list.get(i).toUpperCase()
		}
		System.out.println("==================================");
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		driver.close();
	}

}
