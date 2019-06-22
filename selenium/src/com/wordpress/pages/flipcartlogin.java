package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flipcartlogin {
	
	WebDriver driver;
	
	By username=By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password=By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By LoginButton=By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	
	public flipcartlogin(WebDriver driver) {
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
