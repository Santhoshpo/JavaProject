//WAST print the X & Y co-ordinates of username textfield?

package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester43 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		Point pt = username.getLocation();
		int X = pt.getX();
		int Y = pt.getY();
		System.out.println("X coordinate value = "+ X);
		System.out.println("Y coordinate value = "+ Y);
		driver.close();
	}

}
