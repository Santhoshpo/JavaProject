//WAST click on the curren date in the clear trip flight depature calendar pop up

package handlingPopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester13 extends BaseSettings
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();//gives the current system date and time
		int day = ldt.getDayOfMonth();//returns the current day number in primitive int form
		String dayOfMonth = Integer.toString(day);//to convert integer into string
		String month = ldt.getMonth().name();//to get the current month name
		month = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();//converting the month name into capitalized(camel case) word.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()="+dayOfMonth+"']")).click();		
	}
}
