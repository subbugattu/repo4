package selenium_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_exp {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	   
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		

	}

}
