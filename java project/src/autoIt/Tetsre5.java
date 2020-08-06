//WAST to open calulator and Notepad

package autoIt;

import java.io.IOException;

public class Tetsre5 
{
	public static void main(String[] args) throws IOException
	{
		Runtime run = Runtime.getRuntime();
		run.exec("calc.exe");
		Runtime.getRuntime().exec("notepad.exe");
		
	}

}
