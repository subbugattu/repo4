package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcel

{
	WebDriver driver;
	
	@Test(dataProvider="testdata")
	
	public void Demoproject(String username, String password) throws InterruptedException
	
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
	//	 Assert.assertTrue(driver.getTitle().matches("Find a Flight: Mercury Tours:"), "Invalid credentials");
		 System.out.println("Login successful");
		 
		// System.out.println(driver.getTitle());
		 
		 driver.quit();
		 }
		
		
	
	
	
	@ DataProvider(name="testdata")
	public Object[][] passdata(){

	 Object[][] data=new Object[4][2];
	
	data[0][0]="subbu";
	data[0][1]="9515322690";
	
	data[1][0]="9515322690";
	data[1][1]="subbugattu";
	
	data[2][0]="sufhd113@34";
	data[2][1]="curajhfiu";
	
	data[3][0]="";
	data[3][1]="";
	
	return data;
	}
	

}
