// WAST click on signin button of vtiger live application without entering username and password.[Tester 10-1]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester27 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/log-in/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
	}

}
