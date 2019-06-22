package selenium_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.bing.com/");
		
		driver.manage().window().maximize();
		
		WebElement travels=driver.findElement(By.id("sc_hdu"));
		
		List<WebElement>links=travels.findElements(By.tagName("a"));
		
		System.out.println("no of links: "+links.size());
		
		int count=0;
		
		for(int i=0;i<=links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				count++;
			}
		}
		
		System.out.println("no of visible links: "+count);
		
		int hidden;
		
		hidden=links.size()-count;
		
		System.out.println("no of hidden links: "+hidden);

	}

}
