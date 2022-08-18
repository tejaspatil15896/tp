package TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testdepend {
	@Test
    public void a() {
		
	System.out.println("123");
	Assert.assertTrue(false);
}
	@Test(dependsOnMethods="a")
    public void b() {
	System.out.println("124");
}
	
}
