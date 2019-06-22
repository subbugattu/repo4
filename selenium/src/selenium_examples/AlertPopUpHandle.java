package selenium_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {
	
	

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver=new FirefoxDriver(); //launch the  browser
     
     driver.manage().window().maximize();
     
     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");     
     
     driver.findElement(By.name("proceed")).click();  //click go button
     
     Thread.sleep(5000);
     
     Alert alert=driver.switchTo().alert();
     
     System.out.println(alert.getText());
     
     String text=alert.getText();
     
     if(text.equals("please enter a valid user name")) {
     
     System.out.println("correct alert message");
	}
	else {
		System.out.println("in-correct alert message");
	}
     
     alert.accept();
		
	
	
		

	}

}
