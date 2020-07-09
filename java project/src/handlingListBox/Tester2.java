/* WAST perform following operations
 * i) select any value by using index
 * ii) select any value by using visible text
 * iii) select any value by using value attribute's value
 * iv) print the first selected option before and after performing all the operations
 */

package handlingListBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.BaseSettings;

public class Tester2 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("D://html/sample.html");
		WebElement javaListBox = driver.findElement(By.id("java"));
		Select select = new Select(javaListBox);
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		select.selectByVisibleText("Constructor");
		Thread.sleep(3000);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("p");
		Thread.sleep(3000);
		firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
	}
}
