package testNg;



import org.testng.annotations.Test;

public class dependency {
	
	@Test
	
	public void openbrowser() {
		
		System.out.println("open the browser");
		
	}
	
	
	@Test(dependsOnMethods= {"openbrowser"})
	
	public void signin() {
		
		System.out.println("this will be execute after open the browser");
	}
	
	@Test(dependsOnMethods= {"signin"})
	
	public void signout() {
		
		System.out.println("this will be execute after signin");
		
		
	}
	
	
	
}