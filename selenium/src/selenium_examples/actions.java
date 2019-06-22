package selenium_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement eve1=driver.findElement(By.xpath(".//*[@id='menu-item-4358']/a"));
		
		WebElement eve2=driver.findElement(By.xpath(".//*[@id='menu-item-4350']/a"));
		
		act.moveToElement(eve1).moveToElement(eve2).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='menu-item-4352']/a/span")).click();
 
	
	}

}
