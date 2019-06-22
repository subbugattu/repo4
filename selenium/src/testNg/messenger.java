package testNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class messenger

{
	@Test
	public void loginmessenger() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.messenger.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("8121720209");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\screenshots"));
			
			
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
			
		
		
		
		
	}

}
