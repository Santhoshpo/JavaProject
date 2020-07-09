//WAST verify whether "previous" element is disabled in skillrary testing app?

package s20_04_2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester51 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app/login.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		driver.get("http://live.skillrary.com/testing-app/admin/sales.php");
		System.out.println(driver.findElement(By.id("example1_previous")).isEnabled());		
	}

}
