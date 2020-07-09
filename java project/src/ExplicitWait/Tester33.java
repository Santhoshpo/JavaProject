//WAST click on keep logged in checkbox in actitime app.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester33 extends BaseSettings 
{ 
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	
	//	WebElement checkBox = driver.findElemet(By.id("KeepLoggedInlabel"));
		
		WebElement checkBox = driver.findElement(By.id("KeepLoggedInCheckBox"));
		
		checkBox.click();
		
		if(checkBox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
	}

}
