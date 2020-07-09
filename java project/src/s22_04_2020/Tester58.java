//WAST to take the screenshot

package s22_04_2020;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester58 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("errorshot.png");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		driver.close();
	}

}