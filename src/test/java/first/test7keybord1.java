package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7keybord1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/"); 
			
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.click();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.sendKeys(Keys.ENTER);
		
		
	}

}
     


//act.keyDown(txt_email, Keys.SHIFT).sendKeys("absc").keyUp(Keys.SHIFT).build().perform();
//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();



/*WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
Actions act=new Actions(driver);
act.keyDown(txt_email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();

act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
txt_password.click();

act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
btn_login.sendKeys(Keys.ENTER);

}*/
