package datadrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tester1 
{
	public static void main() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		System.out.println(wb.getNumberOfSheets());
		Sheet sh = wb.getSheet("sheet1");
		System.out.println(sh.getSheetName());
		Sheet sh2 = wb.getSheetAt(0);//gets the sheet object based on Index
		System.out.println(sh2.getSheetName());
	}
}
