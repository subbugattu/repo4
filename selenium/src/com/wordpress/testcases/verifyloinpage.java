package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.loginpage_1;

public class verifyloinpage {
	
	@Test
	
	public void checkloginpage() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 
	loginpage_1 login= PageFactory.initElements(driver, loginpage_1.class);
	
	login.loginTofacebook("8121720209", "8121720209");
	
	driver.quit();
		
	}
	

}
