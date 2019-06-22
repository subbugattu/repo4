package selenium_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.softwaretestingmaterial.com/manual-testing-tutorial/");
		

	}

}
