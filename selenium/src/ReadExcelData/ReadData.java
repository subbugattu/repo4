package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception{
		
		
		File src=new File("C:\\Users\\Admin\\git\\repository\\selenium\\New folder\\readData.xlsx");
		
		FileInputStream file=new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
		
		
		System.out.println("the username is "+data0);
	
		

	}

}
