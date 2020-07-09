package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String PageSrc=driver.getPageSource();
		String text="Please Identify Yourself";
		if (PageSrc.contains(text))
		{
			System.out.println("Passed");
		}
		else 
		{
			System.out.println("failed");
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
