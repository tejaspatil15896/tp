package cb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	WebDriver driver;
	@Parameters("BrouserName")
@BeforeMethod
public void bm(String BrouserName ) {
	if(BrouserName.equalsIgnoreCase("edge")) {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();}
	
	else if(BrouserName.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();}

	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
}

@AfterMethod
 public void am() {
	driver.close();
}

}
