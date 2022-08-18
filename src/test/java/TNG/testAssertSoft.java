package TNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testAssertSoft { //by creating assert class object we create soft assert it is also known as varification
@Test                         //imn soft asssert if assert is fall than next line also perform 
public void m2() {
	System.out.println("Email");
	System.out.println("password");
	System.out.println("login");
	
	String expexted="FaceBook";
	String actual="facebook";
	
	
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actual, expexted);
	
	System.out.println("homepage");
	sa.assertAll();
	
}
}
