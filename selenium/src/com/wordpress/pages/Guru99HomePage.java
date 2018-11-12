package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {
	
	WebDriver driver;
	
	By HomePageUserName=By.xpath("//table//tr[@class=heading]");
	
	 Guru99HomePage(WebDriver driver){
	 
	 this.driver=driver;

}
	 
	 public String gethomepagedashboardUserName() {
		return driver.findElement(HomePageUserName).getText();
	 }
    
}