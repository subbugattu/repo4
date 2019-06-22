package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestngTest

{
	public String BaseUrl="http:newtours.demoaut.com/";
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setbaseUrl() {
		
		driver=new FirefoxDriver();
		driver.get(BaseUrl);
		
	}
	@Test
	public void verifyHomepage() {
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@AfterTest
	public void endsession() {
		driver.quit();
	}
}
	
	
	
	
	
	


