package testNg;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_exp {
	
	WebDriver driver=new FirefoxDriver();
	
	@Test
	
	public void loginTofacebook() {
		
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("facebook");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		driver.findElement(By.id("email")).sendKeys("8121720209");
		log.info("emiai has been entered");
		
		driver.findElement(By.id("pass")).sendKeys("8121720209");
		log.info("password has been entered");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		log.info("login button has been clicked");
		
	}
	
	@BeforeTest
	 
	 public void clickloginbutton() {
		
		PropertyConfigurator.configure("Log4j.properties");
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("facebook");
       
		 driver=new FirefoxDriver();
		 log.info("browser has been opened");
		 
		 
		 driver.manage().window().maximize();
		 log.info("maximised the browser window");
		 
		 String url="https://www.facebook.com/";
		 
		 driver.get(url);
		 log.info("url has been entered");
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 log.info("browser wait for 20 secends");
		 
		 
	 }
	 
	 @AfterTest
	 
	 public void close() {
		 
		 BasicConfigurator.configure();
		 Logger log=Logger.getLogger("facebbok");
		 PropertyConfigurator.configure("Log4j.properties");
		 
		 driver.quit();
		 
		 log.info("close the browser");
		 
		 
	 }

}
