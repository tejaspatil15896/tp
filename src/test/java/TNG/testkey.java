package TNG;

import org.testng.annotations.Test;

public class testkey {
@Test(priority=0)
	public void a() {
	System.out.println("a");
}

@Test(priority=2,invocationCount=2)
	public void c() {
	System.out.println("c");}

@Test(priority=-1,enabled=false)
	public void b() {
	System.out.println("b");
}
@Test(priority=3)
    public void d() {
    System.out.println("d");
}	
	
	
	
}
