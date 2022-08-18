package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		WebElement txt_search=driver.findElement(By.xpath("//input[@name='q']"));
		txt_search.sendKeys("weather"); 

		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	    Thread.sleep(3000);
		System.out.println(list.size());
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("weather forecast"));
			
			list.get(i).click();
			break;
			
			
		}
	driver.close();
	}

}
