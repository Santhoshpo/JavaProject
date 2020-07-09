package datadrivenPropertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.BaseSettings;

public class Tester3 extends BaseSettings
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin = new FileInputStream("./testdata/testdata2.properties");
		Properties prop = new Properties();
		prop.load(fin);
		String value = prop.getProperty("url");
		System.out.println(value);
		
		WebDriver driver = new ChromeDriver();
		driver.get(value);	
	}
}
