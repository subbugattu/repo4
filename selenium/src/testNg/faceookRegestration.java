package testNg;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class faceookRegestration {
	
	@Test
	public void newRegistration() {
		
		BasicConfigurator. configure();
		PropertyConfigurator.configure("Log4j.properties");
		Logger log=Logger.getLogger("facebookRegistration");
		
		
		WebDriver driver=new FirefoxDriver();
		log.info("browser launched");
		
		driver.get("https://www.facebook.com/");
		log.info("url hasbeen entered");
		driver.manage().window().maximize();
		log.info("maximised the window");
	    driver.findElement(By.name("firstname")).sendKeys("subbu");
		log.info("first name has been entered");
		driver.findElement(By.name("lastname")).sendKeys("gattu");
		log.info("last name has been entered");
		driver.findElement(By.name("reg_email__")).sendKeys("tvkrishna595@gmail.com");
		log.info("email has bee entered");
		//driver.findElement(By.name("reg_email__")).click();
		driver.findElement(By.id("u_0_r")).sendKeys("tvkrishna595@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("8121720209");
		log.info("password has been entered");
	WebElement day=	driver.findElement(By.id("day"));
	
	WebElement month=	driver.findElement(By.id("month"));
	WebElement year=	driver.findElement(By.id("year"));
	WebElement gender=driver.findElement(By.id("u_0_a"));
	
	gender.click();
	driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();

	Select sell1=new Select(day);
	sell1.selectByIndex(18);
	//log.info("day is selected");
	
	Select sell2=new Select(month);
	sell2.selectByIndex(4);
	//log.info("month is selected");
	
	Select sell3=new Select(year);
	sell3.selectByValue("1995");
	//log.info("year is selected");
	
	
	
	//driver.quit();

	}
	

	

}
