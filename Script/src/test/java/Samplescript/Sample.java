package Samplescript;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class Sample {
	public static void main(String[] args) 
	 { 
//	  System.setProperty("key","value"); 
//	  String key="webdriver.chrome.driver" ;//This indicates which browser 
//	  String value="./src/main/resources/chromedriver.exe";//This indicates path of browser 
//	  System.setProperty(key,value); 
//	  ChromeDriver driver = new ChromeDriver(); 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
	 } 
}