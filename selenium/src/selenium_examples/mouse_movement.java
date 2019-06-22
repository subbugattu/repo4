package selenium_examples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_movement {
	
	@Test

	   public void  MouseAction() throws InterruptedException{
		
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("facebook");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		WebDriver driver=new FirefoxDriver();
		log.info("browser launched succesfully");
		
		driver.manage().window().maximize();
		log.info("maximised the browser window");
		
		driver.get("https://www.spicejet.com/");
		log.info("url has been entered");
		
		Actions action=new Actions(driver);
		log.info("action class taken");
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		log.info("locate the required elemnet");
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath(".//*[@id='header-addons']/ul/li[14]/a")).click();
		
		log.info("locate the perticular element from the list");
		
		driver.quit();
		
		log.info("close the browser driver");
			
		

	}

}
