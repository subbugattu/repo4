package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.fbloginpage;



public class checkloginpage {
	
	@Test
	
	public void verifyloginpage() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	fbloginpage login=new fbloginpage(driver);
	
	login.typeusername("8121720209");
	login.typepassword("8121720209");
	login.clickOnLoginButton();
	driver.quit();
		
	}

}
