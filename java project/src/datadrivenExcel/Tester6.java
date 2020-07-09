package datadrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester6 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		System.out.println(wb.getNumberOfSheets());
		Sheet sheet1 = wb.getSheet("sheet1");
		boolean password = sheet1.getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(password);	
	}
}
