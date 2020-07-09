package Basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester9 extends BaseSettings
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		for(String wid:set)
		{
			System.out.println(wid);
		}
		Thread.sleep(5000);
		driver.quit();
	
	}

}
