//WAST click on next year same date in the clear trip flight departure calendar pop up(generic code).
package handlingPopUps;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester16 extends BaseSettings
{
	public static void main(String[] args)
	{
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);//gives the date after one year
		String month1 = ldt.getMonth().name();
		month1 = month1.substring(0,1).toUpperCase()+month1.substring(1).toLowerCase();
		int d = ldt.getDayOfMonth();
		String day1 = Integer.toString(d);
		int y = ldt.getYear();
		String year1 = Integer.toString(y);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		outer:
			for(;;)
			{
				//pass to the next screen
				driver.findElement(By.xpath("//a[contains(@class,'nextMonth')]")).click();
				//picks the month name
				List<WebElement> months = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).findElements(By.className("ui-datepicker-month"));
				//picks the year value
				List<WebElement> years = driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]")).findElements(By.className("ui-datepicker-year"));
				for(WebElement month : months)
				{
					if(month.getText().equals(month1))//verify the month
					{
						for(WebElement year : years)
						{
							if(year.getText().equals(year1))//verify the year
							{
								break outer;
							}
						}
					}
						
				}
			}
		driver.findElement(By.xpath("//span[text()='"+month1+"']/../../..//a[text()='"+day1+"']")).click();
		
	}

}
