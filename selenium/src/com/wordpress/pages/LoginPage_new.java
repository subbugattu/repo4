package com.wordpress.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_new

{
	WebDriver driver;
	public LoginPage_new(WebDriver IDriver)
	
	{
		this.driver=IDriver;
	}
	
	 @FindBy(id="user-login")
	 WebElement username;
	 
	 @FindBy(how=How.ID,using="user-pass")
	 WebElement password;
	 
	 @FindBy(how=How.XPATH,using=".//*[@id=wp-submit]")
	 WebElement submit_button;
	 
	 @FindBy(how=How.LINK_TEXT,using="lost your password")
	 WebElement forget_password_link;
	 
	 public void login_wordpress(String uid,String pass)
     
	 {
		 username.sendKeys(uid);
		 password.sendKeys(pass);
		 submit_button.click();
	 }

}
 