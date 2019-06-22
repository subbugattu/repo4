package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	
	@Test(dataProvider="WordpressData")
	
	public void LoginToWordpress(String username,String password) throws InterruptedException 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp_login.php");
		
		
		
		driver.findElement(By.id("user_id")).sendKeys("");
		driver.findElement(By.id("user_pass")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id=wp_submit")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
	     
		driver.quit();
	}
	
	    @ DataProvider(name="WordpressData")
	    public Object[][] passData()
	    {
	    	
	    	Object[][] data=new Object[3][2];
	    	
	    	data[0][0]="admin1";
	    	data[0][1]="demo1";
	    	
	    	data[1][0]="admin";
	    	data[1][1]="demo123";
	    	
	    	data[2][0]="admin2";
	    	data[2][2]="demo1234";
	    	
	    	return data;
	    	
	    	
	    }
		
}		
		
		
		
		
		
		
		
		
	


