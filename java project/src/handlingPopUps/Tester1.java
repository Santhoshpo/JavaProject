//WAST click on OK button of alert pop up.

package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester1 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D:/html/handlingPopUps/sample.html");
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Text :: "+ alertText);
		alert.accept();
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
