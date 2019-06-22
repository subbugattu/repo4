package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class flipkartlogin {
	
	WebDriver driver;
	
	public flipkartlogin(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement submit_button;
	

	public void logintoflipkart(String uid,String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
	
	
}
