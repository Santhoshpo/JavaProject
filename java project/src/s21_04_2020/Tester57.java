//Handle default auto suggestions o google

package s21_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester57 extends BaseSettings
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().click();
		
		Thread.sleep(5000);
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='sbt')]"));
		System.out.println(autoSuggestions.size());
		
		for(WebElement suggestion : autoSuggestions)
		{
			System.out.println(suggestion.getText());
		}
		
		autoSuggestions.get(1).click();
		
	}

}
