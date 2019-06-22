package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

public class redbus {
	
	@Test
	public void redbus() {
		
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.redbus.in/");
     driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/label")).sendKeys("bangalore");
	 driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/label")).sendKeys("ongole");
	 driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).sendKeys("date");
	 driver.findElement(By.xpath(".//*[@id='search']/div/div[4]/div/label")).sendKeys("date");
	 driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
	}
}
