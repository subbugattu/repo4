package testNg;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(groups= {"car"})
	
	public void car1() {
		
		System.out.print("batch car-test car1");
	}
	
	@Test(groups= {"car"})
	
	public void car2() {
		
		System.out.println("batch car-test car2");
	}
	
	@Test(groups= {"scooter"})
	
	public void scooter1() {
		
		System.out.println("batch scooter-test scooter1");
		
	}
	
	@Test(groups= {"scooter"})
	
	public void scooter2() {
		
		System.out.println("batch scooter-test scooter2");
		
		
	}
	
	@Test(groups= {"car" ,"sedan car"})
	
	public void sedan1() {
		
		System.out.println("batch sedan car-test sedan1");
	}

}
