package TNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {
     WebDriver driver;
	@BeforeMethod
		public void bm() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		}
	@AfterMethod
	    public void am() {
		driver.close();
		
	}
	
	
}

