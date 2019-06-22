package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestDDT {
	 
	 
WebDriver driver;
XSSFWorkbook wb;
XSSFSheet sh1;
int numrow;
XSSFCell cell;
String username;
String password;


 
@BeforeTest


public void Setup()



 
{
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
}
 
//@Test(dataProvider="testdata")
//public void TestFireFox(String uname,String password1)
// 
//{
// 
//driver.findElement(By.id("email")).clear();
////driver.findElement(By.id("email")).sendKeys(uname);
//driver.findElement(By.id("pass")).clear();
//driver.findElement(By.id("pass")).sendKeys(password1);
//}
 @Test
public void TestDataFeed()throws IOException{
 

 
	File src=new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\TestData\\FB_TestData.xlsx");
	FileInputStream input=new FileInputStream(src);
			
			wb=new XSSFWorkbook(input);

//wb=XSSFWorkbook(new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\TestData\\FB_TestData.xlsx"));
			
			// here we need to specify where you want to save file
			 
			 
			 
			 
			// finally write content 
			 
			
			 
			
 

sh1= wb.getSheetAt(0);

numrow=sh1.getLastRowNum();
//numrow=numrow+1;

 for(int i=0;i<numrow ;i++)
 {
	 cell = sh1.getRow(i).getCell(0);
	 cell.setCellType(Cell.CELL_TYPE_STRING);

	 driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
	 
	 cell = sh1.getRow(i).getCell(1);
	 
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	 
	          driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
	          
	          driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	          sh1.getRow(0).createCell(2).setCellValue("pass");

	          FileOutputStream fout=new FileOutputStream(src);
	          
	          wb.write(fout);
	          
	         

driver.quit();


}
 
}
 
 

 
	 
	
 

	 

 }



	


