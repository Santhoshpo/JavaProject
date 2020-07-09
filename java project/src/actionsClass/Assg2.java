//WAST verify whether all the drop down menu items of "Login as employee instead" is displayed or not and 
//finally click on "contact us" link of that drop down menu

package actionsClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.BaseSettings;

public class Assg2 extends BaseSettings
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/trex/");
		WebElement jobseekerLogin = driver.findElement(By.xpath("//span[.='Login as Employer instead']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(jobseekerLogin).perform();
		ArrayList<String> expectedLinkTexts = new ArrayList<String>();
		expectedLinkTexts.add("LOGIN HERE");
		expectedLinkTexts.add("BUY ONLINE");
		expectedLinkTexts.add("CONTACT US");
		List<WebElement> menuLinks = driver.findElements(By.xpath("//div[contains(@class,'mega-dropdownhidden-md')]//a"));
		ArrayList<String> actualLinkTexts = new ArrayList<String>();
	
		for(WebElement menuLink : menuLinks)
		{
			actualLinkTexts.add(menuLink.getText());
		}
		
		if(expectedLinkTexts.equals(actualLinkTexts))
		{
			System.out.println("All the LinkTexts are Displayed");
		}
		else
		{
			System.out.println("All the LinkTexts are not Displayed");
		}
		System.out.println("EXPECTED LINKS :: "+expectedLinkTexts);
		System.out.println("ACTUAL LINKS :: "+actualLinkTexts);
		menuLinks.get(menuLinks.size()-1).click();
	}
}
