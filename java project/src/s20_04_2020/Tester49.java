package s20_04_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester49 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D:/html/index2.html");
		System.out.println(driver.findElement(By.id("b")).isEnabled());
		System.out.println(driver.findElement(By.id("r")).isEnabled());
		System.out.println(driver.findElement(By.id("c")).isEnabled());
		System.out.println(driver.findElement(By.id("btn")).isEnabled());
		
		driver.close();
	}
}
