package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle="Facebook";
		String actualTitle=driver.getTitle();
			if(actualTitle.contains(expectedTitle))
			{
				System.out.println("test case is passed");
			}
			else
			{
				System.out.println("test case is failed");
			}
			
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
