//A sample script to demonstrate hiw multiple lines of javascript code can be written in executescript

package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester89 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement health = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[5]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var health=arguments[0];"+
						"var att=document.createAttribute('id');"+
						"att.value='health';"+
						"health.setAttributeNode(att);", health);
	}

}
