//WAST  click on gender-male in facebook app.

package ExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester34 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement radioButton = driver.findElement(By.xpath("//label[.='male']/../input[@name='sex']"));
		
		radioButton.click();
		
		if(radioButton.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
	
	}

}
