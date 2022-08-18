package cb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test11 extends baseClass {
@Test	
	public void login_page() {

	WebElement txt_email=driver.findElement(By.id("email"));
	txt_email.sendKeys("124567@12");
	
	WebElement txt_password=driver.findElement(By.id("pass"));
	txt_password.sendKeys("987654321");
	
	WebElement btn_login=driver.findElement(By.xpath("//button[text()='Log In']"));
	btn_login.click();
	
	
}}
