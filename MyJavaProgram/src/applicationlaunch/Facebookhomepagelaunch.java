package applicationlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebookhomepagelaunch {
	
      
	  public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://livetech.in/");
		  
		  driver.close();
		  
		  
		
		 
			  
			
					
					
					
	}
	}

