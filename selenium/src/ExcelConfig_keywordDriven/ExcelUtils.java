package ExcelConfig_keywordDriven;


import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet  ExcelWSheet;
	
	private static XSSFWorkbook  ExcelWBook;
	
	private static XSSFCell cell;
	
	public static void setExcelFile(String path,String SheetName)throws Exception {
		
		FileInputStream ExcelFile=new FileInputStream(path);
		ExcelWBook=new XSSFWorkbook(ExcelFile);
		ExcelWSheet=ExcelWBook.getSheet(SheetName);
		
	}
	
	public static String getCellData(int RowNum,int ColNum)throws Exception {
		
		
		cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
		
		String CellData=cell.getStringCellValue();
		
		return CellData;
		
	}

}
