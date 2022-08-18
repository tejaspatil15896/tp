package first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test8ScreenShot {

	public static void main(String[] args) throws Exception {
	  WebDriverManager.edgedriver().setup();
	//inerfacerefrence   refrence of object=responsible for objrct creatin  class
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com/");
  
	  WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	  txt_email.sendKeys("qazwsx@iou.com");
	  WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
	  txt_password.sendKeys("1457");
	  WebElement btn_login=driver.findElement(By.xpath("//button[text()='Log In']"));
	  btn_login.click();
	  
	   String path="C:\\Users\\tejas\\eclipse-workspace\\tp\\screenshot";
	   String rs=RandomString.make(4);
	  TakesScreenshot tss=(TakesScreenshot)driver;
	  File scr=tss.getScreenshotAs(OutputType.FILE);
	  File destination=new File(path+"//"+rs+"test.png");
	  FileUtils.copyFile(scr, destination);
	  
	  
	  
			  
	  
	  
	  
	  driver.close();
	}

}
