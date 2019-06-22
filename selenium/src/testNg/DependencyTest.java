package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependencyTest {
	
	
	WebDriver driver;
	
     @Test(dependsOnMethods= {"openbrowser"})
     
     public void SignIn()throws Exception {
    	 
    	 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("8121720209");
    	 
    	 driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("8121720209");
    	 
    	 driver.findElement(By.id("loginbutton")).click();
    	 
    	 Thread.sleep(3000);
     }
     
     @Test
     public void openbrowser() {
    	 driver=new FirefoxDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.facebook.com/");
    	 
    	 
     }
     
     @Test(dependsOnMethods= {"SignIn"})
     
     public void closebrowser() {
    	 
    	 driver.quit();
     }
     }


