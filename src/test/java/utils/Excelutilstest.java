package utils;

public class Excelutilstest{


		public static void main(String[]args) {
			
			String excelpath="./data/Book1.xlsx";
			
			String SheetName="Sheet1";
			
			Excelutils excel=new Excelutils(excelpath,SheetName);
			
			excel.getRowcount();
			
			excel.getCellData(1, 0);
			excel.getCellData(1, 1);
			excel.getCellData(1, 3);
			excel.getCellData(2, 1);
			
			
			
			
			
			
			
			
			
			
		}
	

}
