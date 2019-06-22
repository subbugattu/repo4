package testNg;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_login {
	
	WebDriver driver;
	
	

	@BeforeTest
	public void fbloging() {
		
		BasicConfigurator.configure();
		PropertyConfigurator.configure("Log4j.properties");
		Logger log=Logger.getLogger("fb_login");
		
		
		
		driver=new FirefoxDriver();
		log.info("browser launched");
		driver.manage().window().maximize();
		log.info("browser maximised");
		driver.get("https://www.facebook.com/");
		log.info("url has been entered");
		driver.findElement(By.id("email")).sendKeys("8121720209");
		log.info("username has been entered");
        driver.findElement(By.id("pass")).sendKeys("8121720209");
        log.info("password has been entered");
		
	}
	
	@Test
	 public void  click() {
		
		Logger log=Logger.getLogger("fb_login");
	    driver.findElement(By.id("loginbutton")).click();
		log.info("login button clicked"); 
        
		driver.quit();
		log.info("browser exited");
	 }
	    
}
