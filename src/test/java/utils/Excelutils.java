package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Excelutils(String excelpath,String sheetName) {
		
try {
			
			
			 workbook=new XSSFWorkbook(excelpath);
			 sheet=workbook.getSheet(sheetName);
			
			
		
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
		
	}

	
	public static void getCellData(int rowNum,int colNum) {
			
			DataFormatter formatter=new DataFormatter();
			
			Object data=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(data);

}
	
	
	public static void getRowcount() {
		
		
			
			
		int rowcount= sheet.getPhysicalNumberOfRows();
		
		System.out.println("Total Rows count is: "+rowcount);
			
			
	}
	
	
	
}
