import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Sample extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8096459558");
		driver.findElement(By.id("pass")).sendKeys("Santhosh@143");
		driver.findElement(By.id("u_0_b")).click();
	}

}
