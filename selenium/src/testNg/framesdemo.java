package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class framesdemo
{
	
	@Test
	public void testframes() {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.switchTo().frame("w3c");
		driver.findElement(By.xpath("//a[@title=search w3schools]")).click();
		driver.findElement(By.name("serch")).sendKeys("CSS");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
	}

}
