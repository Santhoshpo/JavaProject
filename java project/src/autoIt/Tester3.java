package autoIt;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String title = driver.getTitle();
		Set<String> set = driver.getWindowHandles();
		for(String wid : set)
		{
			if(title.contains("Employment -Job Vacancies - Naukri.com"))
			{
				break;
			}
			else
			{
				driver.switchTo().window(wid);
				driver.close();
			}
			
		}
		
		driver.findElement(By.id("wdgt_file_upload")).click();
		Thread.sleep(5000);
		Runtime run = Runtime.getRuntime();
		run.exec("D://AutoIt/index3.exe");
		
	}

}
