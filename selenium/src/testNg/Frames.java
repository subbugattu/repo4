package testNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	@BeforeMethod()
	public void beforetest()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No.of frames: "+frames.size());
		
		try {
			for(int i=0;i<=frames.size();i++)
			{
				driver.switchTo().frame(i);
				
				try {
					driver.findElement(By.xpath(".//*[@id='navbtn_tutorials']")).click();
	               driver.findElement(By.xpath(".//*[@id='nav_references']/div/div[2]/h3")).click();
						
						
						
										
					
				} catch (Exception e1) 
				{
					driver.switchTo().defaultContent();
				}
				
			}
		} catch (Exception e) {
			System.out.println("for loop ended");
		}
		
		driver.findElement(By.xpath(".//*[@id='topnav']/div/div[1]/a[6]")).click();
				
	}

}
