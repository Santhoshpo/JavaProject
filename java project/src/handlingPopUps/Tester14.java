//WAST click on tommorrow's (i.e next day's) date  in the cleartrip flight departure calendar pop-up.
package handlingPopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester14 extends BaseSettings
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now().plusDays(1);
		int day = ldt.getDayOfMonth();
		String dayOfMonth = Integer.toString(day);
		String month = ldt.getMonth().name();
		month = month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+dayOfMonth+"']")).click();		
	}
}
