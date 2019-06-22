package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail {
	
	@Test
	public void gmail() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?q=gmail&ie=utf-8&oe=utf-8");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='hdtb-msb-vis']/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='hdtb-msb-vis']/div[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='hdtb-msb-vis']/div[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='hdtb-msb-vis']/div[5]/a")).click();
		
	}

}
