package s22_04_2020;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester11 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		LocalDateTime ldt = LocalDateTime.now();
		String s1 = ldt.toString();
		String s2 = s1.replace(':', '-');
		System.out.println(s2);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("santhosh");
		driver.findElement(By.name("pwd")).sendKeys("santhosh");
		driver.findElement(By.id("loginButton")).click();
				
		Thread.sleep(5000);
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		String actualTitle = driver.getTitle();
				
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("PASSED:: Login Successfull");
		}
		else
		{
			TakesScreenshot t = (TakesScreenshot)driver;
			File srcFile = t.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./errorshotPage/"+ s2 + ".png");
			try
			{
				FileUtils.copyFile(srcFile, destFile);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
			
			File srcFile2 = errorMsg.getScreenshotAs(OutputType.FILE);
			File destFile2 = new File("./errorshotElement/"+ s2 + ".png");
			try
			{
				FileUtils.copyFile(srcFile2, destFile2);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("FAILED :: Login is Unsuccessfull");
			
		
			
		}
		
		
		
		
		
	}

}
