package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login 
{
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	
	public login(WebDriver driver)
	{
		username = driver.findElement(By.id("username"));
		password = driver.findElement(By.name("pwd"));
		loginButton = driver.findElement(By.id("loginButton"));
	}
	public void setusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void clickLogin()
	{
		loginButton.click();
	}
}
