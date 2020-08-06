//WAST click on allow button of hidden divison pop up generated automatically in the below website

package handlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester10 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.linkText("Login")).click();-->Not a good approach
		driver.findElement(By.xpath("//span[text()='Forgot?']/../../..//span[text()='Login']"));	
	}
}
