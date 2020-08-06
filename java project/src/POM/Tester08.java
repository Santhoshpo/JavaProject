package POM;

public class Tester08 
{
	public static void main(String[] args) 
	{
		BasePage.openApp("chrome");
		
		LoginPage2 l= new LoginPage2();
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickLogin();
		
		BasePage.closeApp();
	}
}
