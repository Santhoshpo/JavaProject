//Get the total number of sheets of the excel file
//get each sheet name

package datadrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		for (int i=0;i<wb.getNumberOfSheets()-1;i++)
		{
			System.out.println(wb.getSheetAt(i).getSheetName());
		}		
	}
}
