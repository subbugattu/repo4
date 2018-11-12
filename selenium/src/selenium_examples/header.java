package selenium_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class header {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.bing.com/");
		
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement>links=header.findElements(By.tagName("a"));
		
		System.out.println("No of links in header: "+links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			 System.out.println(links.get(i).getText());
		}

	}

}
