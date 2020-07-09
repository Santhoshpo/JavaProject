import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ample
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");

	}

}
