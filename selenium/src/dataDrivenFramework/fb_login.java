package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.excelant.ExcelAntEvaluateCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fb_login {
	
	WebDriver driver;
	
	
	@Test(dataProvider="	+fb_login")
	
	public void login(String username,String password) throws Exception
	{
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.id("u_0_2")).click();
	
	
	Thread.sleep(5000);
	org.testng.Assert.assertTrue(driver.getTitle().contains("Dashboard"), "user is not able to login-invalid credentials");
	
	System.out.println("page title verified-user is able to log in successfully");
	
	}
	
	
	@DataProvider(name="fb_login")
	public Object[][] passdata() throws Exception
	{
		
	ReadWriteExel config=new ReadWriteExel("C:\\Users\\Admin\\eclipse-workspace\\selenium\\TestData\\FB_TestData.xlsx");
	
	int rows=config.getRowCount(0);
	
	Object [][] data=new Object[rows][2];
	
	for(int i=0;i<rows;i++)
	{
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
		
	}
	
	
	return data;
	
	
	
	
	
			
			

}
}