package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook_login {
	
	
	
	@Test(dataProvider="facebook_login")
	
	public void loginTofacebook(String username,String password) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
	    @DataProvider(name="facebook_login")
		public Object[][] passData() throws IOException {
	    	
	    //	ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\Admin\\eclipse-workspace\\selenium\\TestData\\FB_TestData.xlsx");
	    	
	    	//int rows=config.getRowCount(0);
	    	//Object[][] data=new Object[3][2];
	    	//for(int i=0;i<rows;i++) {
	    		
	    		//data[i][0]=config.getdata(0, i, 0);
	    		//data[i][1]=config.getdata(0, i, 1);
	    	//}
			
			Object[][] data=new Object[5][2];
			
			data[0][0]="subbugattu";
			data[0][1]="8121720209";
			
			data[1][0]="8121720209";
			data[1][1]="8121720209";
			
			data[2][0]="subbu";
			data[2][1]="jhfirnmk";
			
			data[3][0]="subjjm12364";
			data[3][1]="123@8gfj";
			
		   	data[4][0]="";
			data[4][1]="";
			
			return data;
			
			
	    }		
			
			
}		
			
			
		
			
			
			
			
		


