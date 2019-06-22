package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	
	WebDriver driver;
	
	
	By username=By.id("email");
	By password=By.id("pass");
	By LoginButton=By.xpath(".//*[@id='loginbutton']");
	
	public fbloginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeusername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	public void typepassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		
	}
	public void clickOnLoginButton() {
		driver.findElement(LoginButton).click();
	}
	
}