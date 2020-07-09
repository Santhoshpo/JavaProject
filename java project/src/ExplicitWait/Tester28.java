//WAST wait for all the links of a webpage and print the text.

package ExplicitWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester28 extends BaseSettings
{
	public static void main(String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	WebDriverWait wait = new WebDriverWait(driver, 20);
	List <WebElement> links = wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 7));

	for(WebElement link: links)
	{
		System.out.println(link.getText());
	}
	
	}

}

// 1. The numberOfElementsToBe() method receives two inputs
// 		 i) Locator By
//		ii) The integer value which is count of located elements

//2. it returns the list of WebElement, i.e The Collection of Identified Elements Based on the locator 
//   will returned in the form "list" type of collection.

//3. On any WebElement we can use getText(), it will return the text of
// Ex::    i) <div> login </div>
//		  ii) <a> google </a>










