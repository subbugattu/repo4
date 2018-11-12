package com.wordpress.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.flipkartlogin;

public class verifyflipkartlogin {
	
	@Test
	
	public void checkloginpage() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		flipkartlogin login=PageFactory.initElements(driver, flipkartlogin.class);
		login.logintoflipkart("subbu", "8121720209");
		
		
	}

}
