package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {


	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver ();
		
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize() ;
        
      
      driver.close();
        
	}
	
	
	

}
