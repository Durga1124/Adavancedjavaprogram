package applicationlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleHomepagelaunch {
	public static void main(String[] args) {
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		driver =new ChromeDriver();
		
		  driver.get("http://google.com");
		  
		 driver.close();
}
}