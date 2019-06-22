package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.facebookaccount;

public class testfacebookaccount

{
	
	@Test
	
	public void verifynewaccount()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		facebookaccount fb=new facebookaccount(driver);
		fb.typefirstname("subbu");
		fb.typesurname("gattu");
		fb.typemobilenumber("8121720209");
		fb.typepassword("8121720209");
	}
	}
	


 