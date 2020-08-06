//WAST click on next year same date in the cleartrip flight departure calendar pop-up

package handlingPopUps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester15 extends BaseSettings
{
	public static void main(String[] args)
	{
		
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
					if(month.getText().equals("July"))//verify the month
					{
						for(WebElement year : years)
						{
							if(year.getText().equals("2021"))//verify the year
							{
								break outer;
							}
						}
					}
						
				}
			}
		driver.findElement(By.xpath("//span[text()='July']/../../..//a[text()='21']")).click();
	}
}
