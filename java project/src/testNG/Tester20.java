package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tester20 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		String actual = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, "actiTIME - Enter Time-Track");
		System.out.println(driver.getCurrentUrl());
		sa.assertAll();
	}
}
