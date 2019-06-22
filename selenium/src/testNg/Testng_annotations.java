package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotations 
{
	public String baseUrl="http://newtours.demoaut.com/";
	WebDriver driver=new FirefoxDriver();
	public String expected=null;
	public String actual=null;
	
	
	@BeforeTest
	public void launchBrowser() {
		driver.get(baseUrl);
		
	}
	@BeforeMethod
	public void verifyHomepageTitle() {
		expected="Welcome: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}	
		@Test(priority=0)
		public void Register() {
			driver.findElement(By.linkText("REGISTER")).click();
			expected="Register: Mercury Tours";
			actual=driver.getTitle();
			Assert.assertEquals(actual, expected);
		
	}
		@Test(priority=1)
		public void support() {
			driver.findElement(By.linkText("SUPPORT")).click();
			expected="Under Construction: Mercury Tours";
			actual=driver.getTitle();
			Assert.assertEquals(actual, expected);
			
		}
		@AfterMethod
		public void goBackToHomepage() {
			driver.findElement(By.linkText("Home")).click();
			
		}
		@AfterTest
		public void terminatebrowser() {
			driver.quit();
		}
		
}	
		
	
	
	
	
	
	
	
