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


public class screenshot 
{
	@Test
	public void TakeScreenShot()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/");
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[3]")).click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("E:/subbu.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}

}
