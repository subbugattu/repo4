package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelconfiguration {
	
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public excelconfiguration(String excelpath)
	{
		try {
			
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	 public String getdata(int sheetnumber,int row,int column)
	 {
		sheet1=wb.getSheetAt(sheetnumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		 
	 }
	 public int getRowcount(int sheetIndex)
	 
	 {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

}
