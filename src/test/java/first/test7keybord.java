package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7keybord {

	public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html"); 
		
	Actions act=new Actions(driver);
	
    WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement destn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

	act.dragAndDrop(btn_src, destn).build().perform();
	
	
	}

}








/*  driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();

Actions act=new Actions(driver);

WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement destn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));


act.dragAndDrop(btn_src, destn).build().perform();

customHandleDragandDrop(driver,btn_src,destn);

}

public static void customHandleDragandDrop(WebDriver driver,WebElement src,WebElement destn) {

Actions act1=new Actions(driver);
act1.dragAndDrop(src, destn).build().perform();

}*/