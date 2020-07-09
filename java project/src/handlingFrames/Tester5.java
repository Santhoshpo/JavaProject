//WAST enter the email in  emailTF of the embedded page in kuckofflabs application.

package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester5 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.kickofflabs.com/loading-page-templates");
		driver.switchTo().frame("theme-preview-iframe");
		driver.findElement(By.id("email")).sendKeys("mohan@gmail.com");	
	}
}
