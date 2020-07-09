package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester76 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/Java/technologies/Javase-jdc8-downloads.html");
		driver.findElement(By.linkText("Jdk-84251-linux-arm32-vfp-hflt.targz")).click();
		WebElement disableDownload = driver.findElement(By.linkText("Download jdk-8u251-linux-arm32-vfp-hflt.targz"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", disableDownload);		
	}

}
