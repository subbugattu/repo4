package testNg;

import org.testng.annotations.Test;

public class testng_dependency 
{
	
	@Test
	public void Start() {
		System.out.println("server is starting");
		
	}
	@Test(dependsOnMethods= {"Start"})
	public void process() {
		System.out.println("processing the data");
		
	}
	@Test(dependsOnMethods= {"process"})
	public void stop() {
		System.out.println("stop the server");
	}
}
	
	
	
	


