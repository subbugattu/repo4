package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class actions {
	
	@Test
	
	public void login() {
		
		
		WebDriver driver=new FirefoxDriver();
		
	    driver.get("https://www.softwaretestingmaterial.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/span[2]")).click();
	}
		
		
	

}
