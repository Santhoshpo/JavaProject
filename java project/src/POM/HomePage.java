package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="logoutButton")
	private WebElement logout;
	
	@FindBy(className="switcherBackground")
	private WebElement readyRadio;
	
	@FindBy(id="takeSearchContext-field")
	private WebElement takeSearchField;
	
	@FindBy(id="ext_gen23")
	private WebElement calendar;
	
	@FindBy(id="ext_gen44")
	private WebElement calendarBox;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	
	public void selectDay(String month, String day)
	{
		calendar.click();
		calendarBox.findElement(By.xpath("//button[.='"+month+"']/../../../../../../../..//span[.='"+day+"']")).click();
	}
	
	public void clickRadio()
	{
		readyRadio.click();
	}
	
	public void searchTask(String text)
	{
		takeSearchField.sendKeys(text);
	}
}
