package Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tester2 extends BaseSettings
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedUrl="https://www.google.com/";
		String actualUrl=driver.getCurrentUrl();
		if (expectedUrl.equals(actualUrl))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		Thread.sleep(5000);
		driver.close();
		
	}


}
