package ExcelConfig_keywordDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	private static XSSFWorkbook wb;
	
	private static XSSFSheet  sh1;
	
	private static XSSFCell  cell;
	
	
	public static void setExcelfile(String path,String sheetname)throws Exception {
		
		FileInputStream Excelfile=new FileInputStream(path);
		
		wb=new XSSFWorkbook(Excelfile);
		sh1=wb.getSheet(sheetname);
		
	}
	
	public static String getCellData(int RowNum, int ColNum)throws Exception {
		
		cell=sh1.getRow(RowNum).getCell(ColNum);
		
		String CellData=cell.getStringCellValue();
		
		return CellData;
		
	}	
		
	
}		
		
		
	

