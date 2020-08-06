//A Demo java programme to understand robot class methods

package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Tester6 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}
