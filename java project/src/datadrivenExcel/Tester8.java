//WAJP to fetch all the data from excel sheet and store it in object array and print
package datadrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester8
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		System.out.println(wb.getNumberOfSheets());
		Sheet sheet1 = wb.getSheet("sheet1");
		
		Object[][] arr = new Object[sheet1.getPhysicalNumberOfRows()][2];
		
		for (int i=0;i<=sheet1.getPhysicalNumberOfRows()-1;i++)
		{
			int cellLength = sheet1.getRow(i).getPhysicalNumberOfCells();
			for (int j=0;j<=cellLength-1;j++)
			{
				arr[i][j] = sheet1.getRow(i).getCell(j).getStringCellValue();
			}
			System.out.println();
		}
		
		for(Object[] obj : arr)
		{
			for(Object o : obj)
			{
				System.out.print(o+"::");
			}
			System.out.println();
		}
	}
}
