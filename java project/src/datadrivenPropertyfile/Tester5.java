package datadrivenPropertyfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester5 extends BaseSettings
{
	public static void main(String[] args)
	{
		String path = "./testdata/testdata2.properties";
		String url = GenericPropertyLib.getValue(path, "url");
		String user = GenericPropertyLib.getValue(path, "username1");
		String pwd = GenericPropertyLib.getValue(path, "password1");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();		
	}

}
