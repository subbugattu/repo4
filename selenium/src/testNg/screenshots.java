package testNg;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class screenshots 
{
	
	@Test
	public void Testscreenshots() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[3]")).click();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]/div/div[1]/ul/li[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[4]")).click();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[2]/div/div[1]/ul/li[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[5]")).click();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[3]/div/div[1]/ul/li[2]/a/span")).click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\screenshots"));
			
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}
