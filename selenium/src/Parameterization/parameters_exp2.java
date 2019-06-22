package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_exp2 {
	
	WebDriver driver;
	
	@Test
	
	@Parameters({"username","password"})
	
	public void openbrowser(String username,String password) {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="https://www.mercurytravels.co.in/";
		driver.get(url);
		driver.findElement(By.id("sign_user_email")).sendKeys("subbugattu4453@gmail.com");
		driver.findElement(By.id("sign_user_password")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='modalLogin']/div/div/div[2]/form/button")).click();
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.quit();
		
		
	}
	
}
	