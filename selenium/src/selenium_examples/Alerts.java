package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alerts {
	
	@Test
	
	public void Testalert()throws InterruptedException
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("bangalore");
		driver.findElement(By.id("toPlaceName")).sendKeys("ongole");
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		//WebElement month=driver.findElement(By.id("month"));
	//	WebElement year=driver.findElement(By.id("year"));
		
		//Select sell1=new Select(day);
		//sell1.selectByIndex(7);
		//Select sell2=new Select(month);
		//sell2.selectByIndex(11);
		//Select sell3=new Select(year);
		//.selectByValue("2018");
		
		///driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
		//System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
		
		driver.quit();
	}
}
