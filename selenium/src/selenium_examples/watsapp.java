package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class watsapp {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
	    WebElement header=driver.findElement(By.id("hide_till_load"));
	    

	}

}
