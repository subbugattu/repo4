package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebooklogin

{
	WebDriver driver;
	
	By username=By.id("email");
	By password=By.xpath(".//*[@id='pass']");
	By loginbutton=By.xpath(".//*[@id='loginbutton']");
	
	public facebooklogin(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void typeusername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public void clickloginButton() {
	driver.findElement(loginbutton).click();

}
	

		
	}
