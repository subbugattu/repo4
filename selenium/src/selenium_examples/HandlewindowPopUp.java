package selenium_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlewindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(3000);
		
		Set<String>handle=driver.getWindowHandles();
		
		Iterator<String>it=handle.iterator();
		
		String parentwindowId=it.next();
		
		System.out.println("parentwindowid :"+parentwindowId);
		
		String childwindowId=it.next();
		
		System.out.println("childwindowid:"+childwindowId);
		
		driver.switchTo().window(childwindowId);
		
		Thread.sleep(3000);
		
		System.out.println("child window popup title:"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		
		System.out.println("parent window popup title:"+driver.getTitle());
		
		
		

	}

}
