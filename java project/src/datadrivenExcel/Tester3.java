package datadrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		System.out.println(wb.getNumberOfSheets());
		Sheet sheet1 = wb.getSheet("sheet1");
		System.out.println(sheet1.getLastRowNum());
		System.out.println(sheet1.getPhysicalNumberOfRows());
		Row row = sheet1.getRow(0);//to get the row with index	
		System.out.println(row);
	}
}
