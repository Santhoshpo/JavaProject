package Basics;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10 extends BaseSettings
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(5000);
		Set<String> set=driver.getWindowHandles();
		for (String wid:set)
		{
			driver.switchTo().window(wid);
			String title=driver.getTitle();
			System.out.println(title);
		}
		Thread.sleep(5000);
		driver.close();

	}

}
