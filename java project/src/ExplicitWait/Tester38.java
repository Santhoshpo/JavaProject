//WAST get the value of css propert/Attribute "cursor".

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester38 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement username= driver.findElement(By.id("username"));
		String cursorValue = username.getCssValue("cursor");
		System.out.println(cursorValue);
		
	}

}

//Like above we can get any css properties value
