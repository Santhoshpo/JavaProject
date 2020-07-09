package datadrivenExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcelLibrarySCSA5 
{
	public static Object[][] getDataFromExcel(String path, String sheetname)
	{
		Object[][] arr = null;
		try
		{
			FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet1 = wb.getSheet("sheet1");
			
			arr = new Object[sheet1.getPhysicalNumberOfRows()][2];
			
			for (int i=0;i<=sheet1.getPhysicalNumberOfRows()-1;i++)
			{
				int cellLength = sheet1.getRow(i).getPhysicalNumberOfCells();
				for (int j=0;j<=cellLength-1;j++)
				{
					arr[i][j] = sheet1.getRow(i).getCell(j).getStringCellValue();
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		return arr;
	}
	
	public static String getValue(String path, String sheetName, int r, int c)
	{
		String value = null;
		try 
		{
			FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet1 = wb.getSheet("sheet1");
			value=sheet1.getRow(r).getCell(c).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static int getRowCount(String path, String sheetname)
	{
		int count = 0;
		try
		{
			FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet1 = wb.getSheet("sheet1");
			count = sheet1.getPhysicalNumberOfRows();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static int getColumnsCount(String path, String sheetname, int cellNumber)
	{
		int count = 0;
		try
		{
			FileInputStream fin = new FileInputStream("./testdata/data.xlsx");
			Workbook wb = WorkbookFactory.create(fin);
			Sheet sheet1 = wb.getSheet("sheet1");
			count = sheet1.getRow(cellNumber).getPhysicalNumberOfCells();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return count;
		
	}
	
}
