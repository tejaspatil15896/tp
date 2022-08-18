package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {
    public static void main(String[]args) throws Exception {
    	
    	WebDriverManager.edgedriver().setup();
    	
    	WebDriver driver=new EdgeDriver();
    	
    	driver.get("https://www.facebook.com/");
    	
    	driver.manage().window().maximize();
    		                     //xpath by attribute "id"
    	WebElement txt_email=driver.findElement(By.xpath("//input [@id='email']"));
    	   txt_email.sendKeys("145689@134");
    	                          //xpath by attribute "id"
    	WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
    	   txt_password.sendKeys("12346789");
        Thread.sleep(5000);
                                   //xpath by attribute "name"
    	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
    	  btn_login.click();
    	Thread.sleep(5000);
    	
    	String title=driver.getTitle();
    	String url=driver.getCurrentUrl();
    	System.out.println(title);                //title of page
        System.out.println(url);                  //current url
    	   Thread.sleep(5000);   	
 	
    	driver.close();
    	
    }
}
