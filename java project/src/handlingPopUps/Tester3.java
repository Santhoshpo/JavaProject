//WAST handle prompt pop up in firefox

package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tester3
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("D:/html/handlingPopUps/sample3.html");
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("mohan");
		alert.accept();
		Thread.sleep(5000);
	}
}
