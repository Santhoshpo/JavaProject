

package Encapsulation;
import Encapsulation.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tetser2 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException 
	{
		String[][] sref = new String[2][2];
		sref[0][0] = "admin";
		sref[0][1] = "abcd";
		
		sref[1][0] = "xyz";
		sref[1][1] = "ghi";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		login l =new login(driver);
		for (int i = 0; i <= sref.length-1; i++) 
		{
			String un = sref[i][0];
			String pwd = sref[i][1];
			l.setusername(un);
			l.setPassword(pwd);
			l.clickLogin();
			Thread.sleep(10000);
			
		}			
	}
}
