package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class loginpage_1 {
	
	WebDriver driver;
	
	public loginpage_1(WebDriver Idriver) {
		
		this.driver=Idriver;
	}
	
	 @FindBy(id="email")
	 @CacheLookup
	 WebElement username;
	 
	 @FindBy(id="pass")
	 @CacheLookup
	 WebElement password;
	 
	 @FindBy(id="loginbutton")
	 @CacheLookup
	 WebElement loginbutton;
	 
	 
	 
	 public void loginTofacebook(String uid,String pass) {
		 
		 username.sendKeys(uid);
		 password.sendKeys(pass);
		 loginbutton.click();
		 
	 }
	 
		
	

}
