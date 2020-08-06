package POM;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage2 extends BasePage
{
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement remember;

	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgot;
	
	@FindBy(xpath="//a")
	private List<WebElement> links;
	
	@FindBy(xpath="//img")
	private List<WebElement> images;
	
	public LoginPage2()
	{
		PageFactory.initElements(driver, this);
	}

	public void rememberClick()
	{
		remember.click();
	}
	
	public void forgotClick()
	{
		forgot.click();
	}
	
	public int getLinksCount()
	{
		return links.size();
	}
	
	public int getImagesCount()
	{
		return images.size();
	}
}
