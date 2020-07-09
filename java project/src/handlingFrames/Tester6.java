//WAST send email in rediffmail.com

package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester6 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.className("rd_write")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'rd_subject_datacmp2')]")).sendKeys("A Test Email");
		WebElement emailBodyFrame = driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
		driver.switchTo().frame(emailBodyFrame);
		driver.findElement(By.xpath("//body[contains(@class,'cke_editable')]")).sendKeys("Hello, How are you?");
		driver.switchTo().defaultContent();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.linkText("Send")).click();	
	
	}
}
