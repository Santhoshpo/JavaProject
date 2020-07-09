//WAST click on signup button in facebook login page by using submit().[Tester-11]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester29 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Mohan");
		driver.findElement(By.name("websubmit")).submit();	
	}

}
