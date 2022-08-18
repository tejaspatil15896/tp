package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify the weblement by using locator    id
	WebElement txt_email=driver.findElement(By.id("email"));
	txt_email.sendKeys("124567@12");
	
	WebElement txt_password=driver.findElement(By.id("pass"));
	txt_password.sendKeys("987654321");
	
	WebElement btn_login=driver.findElement(By.name("login"));
	btn_login.click();
	
	
    String currentUrl=driver.getCurrentUrl();
    System.out.println(currentUrl);
    
    
    String title=driver.getTitle();
    System.out.println(title);
    
    Thread.sleep(5000);
    
    driver.close();
    
    
	
	
	
	
	
	
}}
