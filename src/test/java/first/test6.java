package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test6 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	WebElement drp_country=driver.findElement (By.xpath("//select [@name='country']"));
		Select sel=new Select(drp_country);
		
		sel.selectByIndex(261);                // by index
		Thread.sleep(3000);
		sel.selectByValue("ANDORRA");        // by value
		Thread.sleep(3000);
		sel.selectByVisibleText("AMERICAN SAMOA");  // by text
		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
			
			if(text.equals("INDIA")) {
			sel.selectByVisibleText("INDIA");
			break;
			
		}
	}

}
}