package cb;

import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

public class testScroll extends baseClass{
	@Test
	public  void scroll() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)","");
     
	
	
}
}