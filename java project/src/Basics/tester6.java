package Basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester6 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().window().fullscreen();
		
		Dimension dim=driver.manage().window().getSize();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		driver.close();
		
		
	}

}
