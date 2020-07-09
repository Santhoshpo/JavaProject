//Handle auto suggestions

package s21_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester56 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(10000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='sbt')]"));
		System.out.println(autoSuggestions.size());
		
		for(WebElement suggestions : autoSuggestions)
		{
			System.out.println(suggestions.getText());
		}
		
		String xpathExpression = "//a[.='Report inappropriate predictions']/../..//input[@value='Google Search']";
		driver.findElement(By.xpath(xpathExpression)).click();
		driver.close();
		
		

	}

}
