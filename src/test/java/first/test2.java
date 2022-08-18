package first;
 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class test2 {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			String title=driver.getTitle ();
			   System.out.println(title);
			 
			String url=driver.getCurrentUrl();
			   System.out.println(url);
			
			
			driver.navigate().to("https://www.youtube.com/");
	           Thread.sleep(5000);
	        driver.navigate().back();
		       Thread.sleep(5000);
		    driver.navigate().forward() ;
		       Thread.sleep(5000);
			driver.navigate().refresh();
			
			driver.close();		 
			
			
			
			
			

	}

}
