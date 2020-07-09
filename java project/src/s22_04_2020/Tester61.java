//WAST take screenshot with unique filename.

package s22_04_2020;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester61 extends BaseSettings
{
	public static void main(String[] args)
	{
		LocalDateTime ldt = LocalDateTime.now();
		String s1 = ldt.toString();
		String s2 = s1.replace(':', '-');
		System.out.println(s2);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/error1.png");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
