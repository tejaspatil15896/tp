package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7mouse {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();                           // edgedriver's object by refrence of webdriver interface
		driver.get("");                                              //get url for perform operatins
		driver.manage().window().maximize();                         //maximize window
		WebElement drp_botton=driver.findElement(By.xpath(""));      //find elemnt by xpath
		
          Actions act=new Actions(driver);              // action class is use for mouse and keybord oprations
        act.moveToElement(drp_botton).build().perform();                      //move curser to element
        act.moveToElement(drp_botton).click(drp_botton).build().perform();    //move curser to element and click
       
        act.doubleClick(drp_botton).build().perform();   //double click
        act.contextClick(drp_botton).build().perform();  //right click
        
        driver.close();
	}

}



/*//WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions act=new Actions(driver);
	//act.moveToElement(gmail).build().perform();
	
	//act.moveToElement(drp_selenium).click(drp_selenium).build().perform();
	
WebElement Rightclick_ele=driver.findElement(By.xpath("//span[text()='right click me']"));
//act.contextClick(Rightclick_ele).build().perform();

WebElement Double_ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(Double_ele).build().perform();*/
