package Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class sample
{
public static void test(WebDriver driver) throws InterruptedException
{
	driver.get("http://google.com/");
	Thread.sleep(5000);
	driver.close();
}
}

public class Tester1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		sample.test(new ChromeDriver());
	
	}
}


