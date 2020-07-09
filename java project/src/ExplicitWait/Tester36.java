//WAST verify whether tool tip text is correct or not.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester36 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedToolTip = "Do not Select if this Computer is Shared";
		
		String actualToolTip = driver.findElement(By.id("KeepMeLoggedInCaptioncontainer")).getAttribute("title");
		
		if (actualToolTip != null)
		{
			if(actualToolTip.isEmpty())
			{
				System.out.println("Tool tip text is empty");
			}
			else if(actualToolTip.equals(expectedToolTip))
			{
				System.out.println("Tool tip displayed correctly");
			}
			else
			{
				System.out.println("Tool tip is displayed incorrectly");
			}
		}
		else
		{
			System.out.println("Tool tip attribute is not present");
		}
		
		driver.close();
	}

}
