package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(600,400);
		driver.manage().window().setSize(dim);
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
