package TNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ano {

	@BeforeMethod
	public void bm() {
		System.out.println("bm");
			
		
	}
	@Test
	public void test1() {
		System.out.println("test1");
		
	}
	@Test
	public void test2() {
		System.out.println("test2");
		
	}
	@AfterMethod
	public void am() {
		System.out.println("am");
		
	}
	
}
