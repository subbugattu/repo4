package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

        public class Drag$Drop {
        	
	  //  public  void Drag$drop()throws InterruptedException {
        	
        public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']")))
		.release( )
		.build()
		.perform();
		
		Thread.sleep(3000);
		

	}

}
