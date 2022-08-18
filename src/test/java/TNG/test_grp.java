package TNG;

import org.testng.annotations.Test;

public class test_grp {
@Test(priority=1,groups="sanity")
     public void m1() {
	System.out.println("s1");
}
@Test(priority=0,groups="regression")
public void m4() {
System.out.println("re1");
}

@Test(priority=3,groups="critical regression")
public void m2() {
System.out.println("cre1");
}

@Test(priority=2,groups="regression")
public void m3() {
System.out.println("re2");
}
@Test(priority=-1,groups="regression")
public void m5() {
System.out.println("s2");}
}