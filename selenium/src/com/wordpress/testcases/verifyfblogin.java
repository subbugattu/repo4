package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.facebooklogin;

public class verifyfblogin 

{
	
	@Test
	
	public void validlogin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		facebooklogin login=new facebooklogin(driver);
		login.typeusername("8121720209");
		login.typepassword("8121720209");
		login.clickloginButton();
		
		driver.quit();
		
	}

}
