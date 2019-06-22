package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser 
{
	public WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeClass
	public void beforetest(String browser) 
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void click()
	{
		driver.findElement(By.id("gb_70")).click();
	}
}
