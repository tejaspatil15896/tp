package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class testexeldata {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement btn_login=driver.findElement(By.xpath("//button[text()='Log In']"));
           //for get data from exel sheet
         String path= "C:\\Users\\tejas\\eclipse-workspace\\tp\\eData\\qz.xlsx";       
         FileInputStream fis=new FileInputStream(path);  //trow declaration and import
	     XSSFWorkbook wb=new XSSFWorkbook(fis);          //inport from apachi poi
	   
	  String data1= wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	   System.out.println(data1);
	  String data2=wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
	   System.out.println(data2);
	  
	  
	  txt_email.sendKeys(data1);
	  txt_password.sendKeys(data2);
	  btn_login.click();
	  
	 
	  
	  String path_s="C:\\Users\\tejas\\eclipse-workspace\\tp\\screenshot";
	    String rs=RandomString.make(3);
	  TakesScreenshot tss=(TakesScreenshot) driver;
	  File sc=tss.getScreenshotAs(OutputType.FILE);
	  File destination=new File(path_s+"//"+rs+"fb.png");
	  FileUtils.copyFile(sc, destination);
	  
	  driver.quit();
	  
	  
	  
	 
	
	
	}

}
