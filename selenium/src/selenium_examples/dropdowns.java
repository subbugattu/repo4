package selenium_examples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;





public class dropdowns {
	
	
	
	@Test
	
	public void HandleDropdowns() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		WebElement myselectelement=driver.findElement(By.name("dropdown"));
		
		Select dropdown=new Select(myselectelement);
		
		dropdown.selectByVisibleText("Automation Testing");
		
		
	
	}

}
