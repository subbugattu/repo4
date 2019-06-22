package selenium_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class simpleProgram {
	
	
	@Test
	
	public void creteAccount() {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.id("u_0_j")).sendKeys("subbu");
	   driver.findElement(By.id("u_0_l")).sendKeys("gattu");
	   driver.findElement(By.id("u_0_o")).sendKeys("subbugattu4453@gmail.com");
	   driver.findElement(By.id("u_0_v")).sendKeys("8121720209");
	   
	   WebElement day=driver.findElement(By.id("day"));
	   WebElement month=driver.findElement(By.id("month"));
	   WebElement year=driver.findElement(By.id("year"));
	   WebElement gender=driver.findElement(By.id("u_0_a"));
	   gender.click();
	   
	   
	   Select sell1=new Select(day);
	   sell1.selectByIndex(18);
	   Select sell2=new Select(month);
	   sell2.selectByIndex(3);
	   Select sell3=new Select(year);
	   sell3.selectByValue("1995");
	   
	      
	   driver.quit();
	   
	  }   
	   
}   
	    
	


