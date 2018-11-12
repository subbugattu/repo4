package testNg;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myapplication
{
	WebDriver driver;
	@Test
	public void startapp()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
       //* String currentUrl=driver.getCurrentUrl();*//
       //* Assert.assertTrue(currentUrl.contains("auth/login"));*//
}
	@Test
	public void loginapp()
	{
		driver.findElement(By.id("email")).sendKeys("8121720209");
		driver.findElement(By.id("pass")).sendKeys("8121720209");
		driver.findElement(By.id("u_0_3")).click();
	}
	
	@Test
	public void logoutapp()
	{
		//*driver.findElement(By.id("u_0_3"));*//
		
		driver.quit();
		
		
		
		
		
		
	}
}