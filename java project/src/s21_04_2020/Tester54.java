//Total of count of images in facebook

package s21_04_2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester54 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println( "The total count is :: " + images.size());
		
	}

}
