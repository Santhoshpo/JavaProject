package datadrivenExcel;

public class Tester10 
{
	public static void main(String[] args)
	{
		String url = GenericExcelLibrarySCSA5.getValue("./testdata/data.xlsx", "AppUrl", 0, 0);
		System.out.println(url);
		
		int rows = GenericExcelLibrarySCSA5.getRowCount("./testdata/data.xlsx","sheet1");
		System.out.println(rows);
		
		int cols =  GenericExcelLibrarySCSA5.getColumnsCount("./testdata/data.xlsx","sheet1",1);
		System.out.println(cols);
		
	}

}
