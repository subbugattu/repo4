package testNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class test_practice {

	@Test
	public void beforeTest() {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[2]/ul/li[3]")).click();
		WebElement testing=driver.findElement(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]"));
		List<WebElement> Tlinks=testing.findElements(By.tagName("li"));
		
		try 
		{
			for(int i=0;i<=Tlinks.size();i++) 
			{
				System.out.println(Tlinks.get(i).getText());
				Tlinks.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				
			}
			
		} catch (Exception e) {
             System.out.println(e.getMessage());
		}
	
	}

}
