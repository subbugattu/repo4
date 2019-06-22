package selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitle {
	
	
	@Test
	
	public void verifyApplicationTitle() {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://learn-automation.com/");
		
		String title=driver.getTitle();
		
		System.out.println("the title is "+ title);
		
		//String expected_title="Selenium Webdriver Tutorials-Free Selenium";
		
		//Assert.assertEquals(title, expected_title);
		
		Assert.assertTrue(title.contains("selenium webdriver tutorials"));
		
		System.out.println("Test completed-page verified");
	}

}
