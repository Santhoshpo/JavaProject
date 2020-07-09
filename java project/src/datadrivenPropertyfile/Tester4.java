package datadrivenPropertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester4 extends BaseSettings
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fin = new FileInputStream("./testdata/testdata2.properties");
		Properties prop = new Properties();
		prop.load(fin);
		Set<Object> set = prop.keySet();//Returns all the keys in the property file in the form of Object
		String[] users = new String[set.size()/2];//Creating an array to store only usernames
		int i=0;
		
		for(Object key : set )
		{
			String k = (String) key;
			if(k.contains("username"))
			{
				String data = prop.getProperty(k);
				users[i]=data;
				i++;
			}
		}
		
		for(String u: users)
		{
			System.out.println(u);
		}
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");	
		WebElement username = driver.findElement(By.id("username"));
		for(int j=0;j<=users.length-1;j++) 
		{
			username.sendKeys(users[j]);
			Thread.sleep(3000);
			username.clear();
		}	
	}
}
