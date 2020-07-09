package Basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester8 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(600,400);
		driver.manage().window().setSize(dim);
		Thread.sleep(5000);
		Point pt=driver.manage().window().getPosition();
		System.out.println(pt.getX());
		System.out.println(pt.getY());
		Point pt2=new Point(50,60);
		Thread.sleep(5000);
		driver.manage().window().setPosition(pt2);
		driver.close();		
	}

}
