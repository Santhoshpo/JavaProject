//A demo programme for encapsulation

package Encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static WebDriver driver;
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void openApp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");		
	}
	public static void login(String un, String pwd)
	{
		login l = new login(driver);
		l.setusername(un);
		l.setPassword(pwd);
		l.clickLogin();
	}
	public static void closeApp()
	{
		driver.quit();
	}
	
	
	public static void main(String[] args) 
	{
		openApp();
		login("admin","manager");
		closeApp();
		
		openApp();
		login("admin","admin");
		closeApp();
		
		openApp();
		login("abc","xyz");
		closeApp();	
	}
}


