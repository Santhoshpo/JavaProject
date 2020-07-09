package datadrivenExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester9
{
	@DataProvider
	public Object[][] getData()
	{
		return GenericExcelLibrarySCSA5.getDataFromExcel("./testdata/data.xlsx","sheet1");
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = GenericExcelLibrarySCSA5.getValue("./testdata/data.xlsx", "AppUrl", 0, 0);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
}
