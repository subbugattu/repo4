package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTests {
	
	private static WebDriver driver;
	
     @Test(dataProvider="facebooklogin")
	
	public void test(String username,String password) {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
		driver.quit();
     }	
	
       
	@DataProvider(name="facebooklogin")
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data [0][0]="subbugattu";
		data[0][1]="9502221636";
		
		data[1][0]="subbu";
		data[1][1]="9515322690";
		
		data[2][0]="8121720209";
		data[2][1]="8121720209";
		
		return data;
	
	
	      }   	
		
   }	
	
	
     
	
	//@Test(dataProvider="facebook login")
	
	//public void test(String username,String password) {
		
		//driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		//.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
	//	driver.findElement(By.id("loginbutton")).click();
		
		//driver.quit();
		
	//}

//}
