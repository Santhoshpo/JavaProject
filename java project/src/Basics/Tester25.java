//WAST click on login button of actitime application using submit().[tester-7]

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester25 extends BaseSettings
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).submit();
	}

}
