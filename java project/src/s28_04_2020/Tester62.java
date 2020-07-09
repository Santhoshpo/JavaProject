package s28_04_2020;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester62 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		try
		{
			driver.findElement(By.xpath("//button[.='✕']")).click();
		}
		catch(Exception e)
		{
			System.out.println("close not available");
		}
		
		WebElement health = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[4]"));
		List<WebElement> healthLinks = health.findElements(By.tagName("input"));
		System.out.println("Count of health Links :: "+ healthLinks.size());
	}

}
