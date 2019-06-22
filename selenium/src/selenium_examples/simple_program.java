package selenium_examples;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class simple_program {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void logintoguru99() throws InterruptedException {
		
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("guru99");
		PropertyConfigurator.configure("log4j.properites");
		
			
	 driver=new FirefoxDriver();
	 
	 log.info("browser launched");
	
	Dimension d=new Dimension(2020, 5600);
	driver.manage().window().setSize(d);
	log.info("maximised the browser window");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log.info("browser can be wait for 20 secobds");
	driver.get("https://www.guru99.com/");
	log.info("url has been entered");
	
	Actions action=new Actions(driver);
	
	//action.moveToElement(driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[3]"))).build().perform();
	
	action.moveToElement(driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]/div/div[1]/ul/li[1]"))).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]/div/div[4]/ul/li[4]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]/div/div[4]/ul/li[2]")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	}
	
	@Test(priority=1)
	public void logintofacebook() {
		
		driver=new FirefoxDriver();
	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8121720209");
		
        driver.findElement(By.id("pass")).sendKeys("8121720209");
      
        driver.findElement(By.id("loginbutton")).click();
         
        driver.quit();
		
	}
	
	

}
