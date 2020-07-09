//WAST verify whether Buy Now is disabled or enabled in BANGOOD application?

package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester50 extends BaseSettings
{
	public static void main(String[] args)	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("link of E-Commerce app - BANGOOD");
		System.out.println(driver.findElement(By.xpath("(//a[.='Buy Now'])[2]")).isEnabled());
		driver.close();	
	}

}
