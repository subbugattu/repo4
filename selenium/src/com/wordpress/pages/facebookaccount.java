package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebookaccount

{
	WebDriver driver;
	
	By firstname=By.xpath(".//*[@id='u_0_j']");
	By surname=By.xpath(".//*[@id='u_0_l']");
	By mobilenumber=By.xpath(".//*[@id='u_0_o']");
	By password=By.xpath(".//*[@id='u_0_v']");
	
	public facebookaccount(WebDriver driver)
	{
		this.driver=driver;
		
	}
      
	public void typefirstname(String name) {
		driver.findElement(firstname).sendKeys(name);
		
	}
	public void typesurname(String name) {
		driver.findElement(surname).sendKeys(name);
	}
	public void typemobilenumber(String number) {
		driver.findElement(mobilenumber).sendKeys(number);
		
	}
	
	public void typepassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		
		
		
	}
		
	
}
