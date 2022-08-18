package TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAssertH { // it is also known as Hard Assert 
@Test
public void m1() {
	System.out.println("Email");
	System.out.println("password");
	System.out.println("login");
	
	String expexted="FaceBook";
	String actual="facebook";
	
    Assert.assertEquals(actual, expexted);
    
			
	System.out.println("homepage");
}
}
