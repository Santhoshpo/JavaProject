//WAST get the title of actitime homepage.

package ExplicitWait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tester20 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}

//	in the above code gives the title of login page instead of homepage title. Because implicit wait 
//works only for findelement() and findelements(), not for getTitle. So, we should use explicit wait.