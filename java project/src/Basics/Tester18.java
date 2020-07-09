package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester18 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.playstation.com/en-in/");
		driver.findElement(By.partialLinkText("we use cookies")).click();
		Thread.sleep(5000);
	
	}

}
