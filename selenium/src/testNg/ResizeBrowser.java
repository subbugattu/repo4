package testNg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ResizeBrowser {
	
	WebDriver driver;
	
	@Test
	
	public void launchbrowser() {
		
		driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.softwaretestingmaterial.com/");
		
		Dimension d=new Dimension(480, 620);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		//driver.manage().window().maximize();
	}
	
	  

}
