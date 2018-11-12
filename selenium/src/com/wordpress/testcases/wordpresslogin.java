package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class wordpresslogin
{
	@Test
	
	public void verifyvalidlogin()
	  {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login=new LoginPage(driver);
		
		login.typeusername("uid");
		
	    login.typepassword("pass");
	    
	    login.clickloginbutton();
	    
		driver.quit();
				
			
				
		
	  }

}
