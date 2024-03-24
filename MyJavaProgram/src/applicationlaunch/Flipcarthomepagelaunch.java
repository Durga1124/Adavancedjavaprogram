package applicationlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipcarthomepagelaunch {
	WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		options.setBinary("C:\\Users\\durga\\Downloads\\chrome-win64\\chrome-win64\\Chrome.exe");
		
		ChromeDriver  driver=new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		
		 driver.get("http://bing.com");
		  
		  driver.close();
		  
}
}