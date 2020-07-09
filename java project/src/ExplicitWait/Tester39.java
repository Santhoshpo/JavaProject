//WAST verify whether "Administrator" text in bold or not.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester39 extends BaseSettings
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String expectedFontWeight = "700";
		WebElement adminText= driver.findElement(By.id("adminCredentialHeader"));
		String actualFontWeight = adminText.getCssValue("Font-Weight");
		System.out.println(actualFontWeight);
		
		if (actualFontWeight.equals(expectedFontWeight))
		{
			System.out.println("Passed:: Administrator text is bold");
		}
		else
		{
			System.out.println("Failed :: Administrator text is not bold");
		}
		driver.close();
	

	}

}
