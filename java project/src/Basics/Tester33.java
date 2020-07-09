//WAST enter value into the active element of that webpage[Tester 16].
package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester33 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.switchTo().activeElement().sendKeys("admin");	
	}

}
