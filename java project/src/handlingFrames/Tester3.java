//WAST identify the frame based on name attributes value

package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/findex.html");
	//	driver.switchTo().frame("framehello");//NoSuchElementException
		driver.findElement(By.id("username")).sendKeys("mohan");	
	}
}
