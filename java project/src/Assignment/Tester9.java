package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester9 extends BaseSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/html/index3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 List<WebElement> chechBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 System.out.println("Total number of checkboxes : " + chechBoxes.size());
		 
		 for (int i=0;i<=chechBoxes.size()-1;i++)
		 {
			 chechBoxes.get(i).click();
			 if(chechBoxes.get(i).isSelected())
			 {
				 System.out.println("chekbox is selected : "+ i);
			 }
			 else
			 {
				 System.out.println("chekbox is not selected : "+ i);
			 }
		 }
		 driver.close();
		
	}

}
