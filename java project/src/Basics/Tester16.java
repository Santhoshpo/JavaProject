package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester16 extends BaseSettings
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.className("dismiss")).click();
		Thread.sleep(5000);

	}

}
