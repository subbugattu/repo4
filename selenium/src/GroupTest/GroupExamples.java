package GroupTest;

import org.testng.annotations.Test;

public class GroupExamples {
	
	@Test(groups="UnitTest")
	
	public void unitTest() {
		
	System.out.println("i am in testcase one that is  unittest");
		
	}
	
	@Test(groups="integration testing")
	public void integration() {
		
		System.out.println("i am in test case two that is integration testing");
		
	}
	
	@Test(groups="regression testing")
	
	public void regression() {
		System.out.println("i am in testcase three that is regression testing");
	}
	
	@Test(groups="system testing")
	public void systemtesting() {
		System.out.println("i am in testcase four that is system testing");
	}
	
	
	
	
	

}
