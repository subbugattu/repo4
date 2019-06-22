package KeywordDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions {
	
	public static WebDriver driver;
	
	
	public static void OpenBrowser() {
		
		// System.setProperty("webdriver.firefox.driver", "C:\\\\Users\\\\Admin\\\\git\\\\repository\\\\selenium\\\\test\\\\example.xlsx");
		 driver=new FirefoxDriver();
		
	}
	
	public static void Navigate() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com");
	}
	
	public static void input_Username() {
		
		driver.findElement(By.name("userName")).sendKeys("8121720209");
	}
	
	public static void input_Password() {
		
		driver.findElement(By.name("password")).sendKeys("8121720209");
		
	}
	
	public static void click_Login() {
		
		driver.findElement(By.name("login")).click();
	}
	
	
	@Test
	
	public static void verify_Login() {
		
		String pageTitle=driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Find a Flight: Mercury Tours:");
	}
	
	public static void closeBrowser() {
		
		driver.quit();
		
	}

}
	
	
		
	


