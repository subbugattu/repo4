package KeywordDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ActionKeywords {
	
	
	public static WebDriver driver;
	
	
	public static void OpenBrowser() {
		
		driver=new FirefoxDriver();
	}
	
	public static void navigate() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	public static void input_Username() {
		
		driver.findElement(By.id("email")).sendKeys("8121720209");
	}
	
	public static void input_Password() {
		
		driver.findElement(By.id("pass")).sendKeys("8121720209");
		
	}	
	
	public static void click_Login() {
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
	}
	
	//public static void waitFor(){
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//}
	
	
	public static void closeBrowser() {
		
		driver.quit();
	}
	

}
