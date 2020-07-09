//WAST identify the frame based on the webelement

package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester4 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D://html/findex.html");
		WebElement EmbeddedFrame = driver.findElement(By.className("c1"));
		driver.switchTo().frame(EmbeddedFrame);
		driver.findElement(By.id("username")).sendKeys("mohan");	
	}
}
