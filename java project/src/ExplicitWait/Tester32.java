//WASt click on keeploggedinCheckbox in skillrary app.

package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester32 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/login.php");
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
		
		if(checkBox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		driver.close();
	}

}
