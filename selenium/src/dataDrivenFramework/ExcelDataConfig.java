package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.scene.input.DataFormat;

public class ExcelDataConfig 

{
     
   
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath) throws IOException
	{
		//try {
			File src=new File(excelPath);
			
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		//}catch(Exception e) {
			
			//System.out.println(e.getMessage());
		//}
	}
	 public String getdata(int Sheetnumber,int row,int column)
	 {
		 
		
		 sheet1=wb.getSheetAt(Sheetnumber);
		// Cell cell1 = sheet1.getRow(row).getCell(0); 
		// cell1.setCellType(Cell.CELL_TYPE_STRING);
		// String data0= cell1.getStringCellValue();
		 

		 String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		 
		 return data;
		 
	 }
	 public int getRowCount(int sheetIndex)
	 {
		 int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		 
		 row=row+1;
		 
		return row;		 
	 }
		 
		 
	 

}






