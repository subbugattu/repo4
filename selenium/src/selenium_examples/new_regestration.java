package selenium_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class new_regestration {
	
	WebDriver driver;
	
	@Test
	
	public void logintohalf() throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath(".//*[@id='gh-ug-flex']/a")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("subbu");
		driver.findElement(By.id("lastname")).sendKeys("gattu");
		Thread.sleep(3000);
		driver.findElement(By.id("suggestion")).sendKeys("subbugattu11@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("8121720209");
		driver.findElement(By.name("checkbox-default")).click();
		driver.findElement(By.xpath(".//*[@id='ppaFormSbtBtn']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
