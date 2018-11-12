package selenium_examples;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfox {

	public static void main(String[] args) 
	{
	   WebDriver driver=new FirefoxDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   driver.manage().window().maximize();
	   
	   
		

	}

}
