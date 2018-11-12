package selenium_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scrollpage {
	
	@Test
	
	public void testscroll()throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        WebElement searchox=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[1]/div/input"));
        searchox.sendKeys("budda");
        
        WebElement searchButton=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[2]/button"));
        
         searchButton.click();
         Thread.sleep(2000);
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("scrollby(0,2500)");
         
         WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
                 (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));
         
         Assert.assertEquals(pageNumberdisplayer.getText(), "Page: 2");
	}
         
      //  Thread.sleep(5000);
     //   driver.quit();
			
			
			
				
}
			
	
			
			
			
			
	
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        
        


