//Login Script

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester21 extends BaseSettings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement userName=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		if (userName.isDisplayed())
		{
			System.out.println("PASS:: username textField is displayed");
		}
		else
		{
			System.out.println("Failure:: username textField is not displayed");
		}
		
		if(password.isDisplayed())
		{
			System.out.println("PASS:: password textField is displayed");
		}
		else
		{
			System.out.println("Failure:: password textField is not displayed");
		}
		
		if(loginButton.isDisplayed())
		{
			System.out.println("PASS:: loginButton is displayed");
		}
		else
		{
			System.out.println("Failure:: loginButton is not displayed");
		}
		
		userName.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
		String expectedTitle= "actiTIME-Enter Time-Track";
		String actualTitle= driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
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
