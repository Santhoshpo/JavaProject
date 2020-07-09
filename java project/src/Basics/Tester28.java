//WAST click on signin button of vtiger live application by using submit(), by entering valid username and password.[Tester 10-2]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester28 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/log-in/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();

	}

}
