//WAST login to skillrary application by using submit().[Tester 9]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester26 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app/login.php");
		driver.findElement(By.id("last")).submit();
		driver.close();

	}

}
