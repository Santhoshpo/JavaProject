//WAST to varify the image having alt or not in flipkart application?

package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester4 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.flipkart.com/");
		String expectedAltText = "flex";
		String actualAltText = driver.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S')[2]")).getCssValue("alt");
		
		if(actualAltText.equals(expectedAltText)
)
		{
			System.out.println("alt text is present");
		}
		else
		{
			System.out.println("alt text is not present");
			
		}
		driver.close();
		
	}
}
