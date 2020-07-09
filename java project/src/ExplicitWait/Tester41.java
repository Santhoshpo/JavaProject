//WAST print the color of login button in actitime app?

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Tester41 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement adminText= driver.findElement(By.id("loginButton"));
		String color = adminText.getCssValue("color");
		String colorHexa = Color.fromString(color).asHex();
		System.out.println(color);
		System.out.println(colorHexa);
		driver.close();
	}

}
