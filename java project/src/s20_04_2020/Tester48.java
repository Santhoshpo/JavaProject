package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester48 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.id("hp logo"));
		String expectedTagName = "img";
		String actualTagName = google.getTagName();
		
		System.out.println("Expected TagName :: " + expectedTagName);
		System.out.println("Actual TagName :: " + actualTagName);
		
		if(actualTagName.equals(expectedTagName))
		{
			System.out.println("Google is an image");
		}
		else
		{
			System.out.println("Google is not an image");
		}
		driver.close();
	}

}
