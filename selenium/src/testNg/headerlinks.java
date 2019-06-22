package testNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class headerlinks 
{
	
	@Test
	
	public void testheaderlinks() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		driver.findElements(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[1]"));
		WebElement header=driver.findElement(By.xpath("html/body/nav[3]/div"));
	    List<WebElement> links=header.findElements(By.tagName("div"));
		
		try
		{
			for(int i=0;i<=links.size();i++) 
			{
				links.get(i).click();
				System.out.println("number of links:"+links);
				
			}
			
		} catch (Exception e)
		
		{
			System.out.println("i am in exception");
		}
	}

}
