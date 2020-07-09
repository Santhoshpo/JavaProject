package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester13 extends BaseSettings
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("fill:///D:/Html/index.html");
		WebElement element=driver.findElement(By.tagName("a"));
		element.click();
		Thread.sleep(5000);

	}

}
