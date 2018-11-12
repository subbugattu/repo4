package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
  
	WebDriver driver;
    
	By username=By.id("user-login");
	By password=By.xpath(".//[@id='user-pass']");
	By loginbutton=By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
         
	
	    
	    public void typeusername(String uid) {
	    	driver.findElement(username).sendKeys(uid);
	    	
	    }
	     public void typepassword(String pass) {
	    	 driver.findElement(password).sendKeys(pass);
	     }
	     
	     public void clickloginbutton()
	     {
	    	 driver.findElement(loginbutton).click();
	     }
	
	

}
