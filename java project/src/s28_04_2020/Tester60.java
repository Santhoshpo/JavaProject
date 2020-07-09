package s28_04_2020;
/*WAST get the count input elements from fb login page*/
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester60 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement registrationForm = driver.findElement(By.id("reg_form_box"));
	    List<WebElement> inputElements = registrationForm.findElements(By.tagName("input"));
		
	    System.out.println(inputElements.size());
		
		driver.close();
		
		
	}

}
