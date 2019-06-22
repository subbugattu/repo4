package selenium_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Naukri {
	
	@Test
	
	public void PopUp()throws InterruptedException
	
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>I1=s1.iterator();
		
		while(I1.hasNext()) {
			
			String Child_window=I1.next();
			
			if(parent.equals(Child_window))
			{
				
				driver.switchTo().window(Child_window);
				
				
				System.out.println(driver.switchTo().window(Child_window).getTitle());
				
				Thread.sleep(4000);
				
				driver.close();
			}
			
		}
		
	      driver.switchTo().defaultContent();
		
	}

}
