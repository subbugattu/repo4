package dataDrivenFramework;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

public class ReadWriteExel {
	
	

XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFCell cell;

	
		
	
	
	public ReadWriteExel(String excelPath) throws IOException
	 {
		 try {
			 
		 
		File src=new File(excelPath);
		
		FileInputStream finput=new FileInputStream(src);
		workbook=new XSSFWorkbook(finput);
		
		
		 }catch(Exception e) {
			 
			 System.out.println(e.getMessage());
			 
		 }
	 }
	
	public String getData(int sheetNumber,int row,int col)
	{
sheet=workbook.getSheetAt(sheetNumber);
String data=sheet.getRow(row).getCell(col).getStringCellValue();
  return data;

	}
	
	public int getRowCount(int sheetIndex)
	{
		int row=workbook.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		
		return row;
	}
	
}


