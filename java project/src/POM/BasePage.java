package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	public static WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void openApp(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			throw new IllegalStateException("Browser not Found");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}

		@FindBy(id="username")
		private WebElement username;
	
		@FindBy(name="pwd")
		private WebElement password;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		public BasePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setUsername(String un) 
		{
			username.sendKeys(un);;
		}
		
		public void setPassword(String pwd)
		{
			password.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			loginButton.click();
		}
		
		public static void closeApp()
		{
			driver.quit();
		}
	}
