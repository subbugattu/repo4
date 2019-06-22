package selenium_examples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebook {
	
   @Test
   
   public void testfacebook() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
		
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("facebook");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver=new FirefoxDriver();
		log.info("browser launched succefully");
		driver.manage().window().maximize();
		log.info("browser maximised");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8121720209");
		log.info("email has been entered");
        driver.findElement(By.id("pass")).sendKeys("8121720209");
        log.info(" password has been entered");
        driver.findElement(By.id("loginbutton")).click();
        log.info("login butten clicked");
        
        Thread.sleep(2000);
        driver.quit();
        
        
        
	}

}
