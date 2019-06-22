package com.wordpress.testcases;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.flipcartlogin;

public class verifyloginpage {
	
	@Test
	
	public void validlogin() {
		
		BasicConfigurator.configure();
		Logger log=Logger.getLogger("verifyloginpage");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver=new FirefoxDriver();
		log.info("browser has been launched");
		driver.manage().window().maximize();
		log.info("maximised the window");
		driver.get("https://www.flipkart.com/");
		log.info("url hasbeen entered");
		
		flipcartlogin login=new flipcartlogin(driver);
		login.typeusername("subbu");
		log.info("username has been entered");
		login.typepassword("8121720209");
		log.info("password has been entered");
		login.clickOnLoginButton();
		log.info("login button clicked");
		
		driver.quit();
	}

}
