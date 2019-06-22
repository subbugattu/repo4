package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameters {
	
	private static WebDriver driver;
	
	@Test
	

	@Parameters({"Username","Password"})
	
	public void test(String username, String password) {
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("81217820209");
		driver.findElement(By.id("pass")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.quit();
		
		
		
	}

}
