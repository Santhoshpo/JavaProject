// A Demo java programme to understand robot class methods
package robotClass;

import java.awt.AWTException;
import java.awt.Robot;

public class Tester5 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.mouseMove(500, 500);
		
	}

}
