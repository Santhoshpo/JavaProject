//A Demo java programme to understand robot class methods
package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import Basics.BaseSettings;

public class Tester7 extends BaseSettings
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.mouseWheel(100);
		Thread.sleep(3000);
		robot.mouseWheel(-100);	
	}
}
















































