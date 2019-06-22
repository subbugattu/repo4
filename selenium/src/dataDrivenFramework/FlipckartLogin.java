package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipckartLogin {
	
	
	@Test(dataProvider="FlipckartLogin")
	
	public void loginToflipckart(String username,String password)throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		
		 Thread.sleep(40000);
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		
	}
	
	@DataProvider(name="FlipckartLogin")
	
	public Object[][] Data() throws IOException {
		
		
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\Admin\\git\\repository\\selenium\\readData\\TestData2.xlsx");
		
		 int rows=config.getRowCount(0);
		 Object[][]data=new Object[rows][2];
		 for(int i=0;i<rows;i++) {
			 
			 data[i][0]=config.getdata(0, i, 0);
			 data[i][1]=config.getdata(0, i, 1);
		 }	 
			 
		 return Data();
		
	}
	    
	    
	    
	    
	

}
