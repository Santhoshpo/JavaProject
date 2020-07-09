//WAST verify whether the username text in the login panel's info section is normal text or not?

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester40 extends BaseSettings
{
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	String expectedFontWeight = "400";
	WebElement adminText= driver.findElement(By.xpath("(//td[text()='Username'])[1]"));
	String actualFontWeight = adminText.getCssValue("Font-Weight");
	System.out.println(actualFontWeight);
	
	if (actualFontWeight.equals(expectedFontWeight))
	{
		System.out.println("Passed:: Username text is normal text");
	}
	else
	{
		System.out.println("Failed :: Username text is not normal text");
	}
	driver.close();
		
	}

}
