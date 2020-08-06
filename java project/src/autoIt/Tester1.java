//WAST upload your resume in naukri.com

package autoIt;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester1 extends BaseSettings
{
	public static void main(String[] args) 
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
		
		driver.findElement(By.id("file_upload")).sendKeys("D://Selenium.Doc");
		
	  // driver.close();
	}
}
