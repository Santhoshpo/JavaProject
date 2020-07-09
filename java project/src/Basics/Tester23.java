package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester23 extends BaseSettings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https:demo.actitime.com/");
		WebElement userName=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		userName.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));

		
		if(logoutLink.isDisplayed())
		{
			System.out.println("PASS:: Home Page is Displayed");
		}
		else
		{
			System.out.println("Failure:: Home page is Not Displayed");
		}
		driver.close();
			
	}

}
