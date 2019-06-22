package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile

{
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	public ReadExcelFile(String excelpath) {
		
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	   public String data(int sheetnumber,int row,int column) {
		   
		   sh1=wb.getSheetAt(sheetnumber);
		   String data=sh1.getRow(row).getCell(column).getStringCellValue();
		   
		   return data;
	   }
	   
	   public int Rowcount(int sheetIndex) {
		   
		   int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		   row=row+1;
		   return row;
	   }

}
