//WAST click on a signin button using submit() in vtiger demo application.[Tester-7]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester24 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/log-in/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(5000);
		driver.close();

	}

}
