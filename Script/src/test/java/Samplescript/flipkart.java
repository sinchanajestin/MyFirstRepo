package Samplescript;
import org.openqa.selenium.WebDriver;

public class flipkart {
	
		public static void main(String[] args)
		{		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			String source = driver.getPageSource();
			System.out.println(source);
			driver.quit();
			
		}
	}



