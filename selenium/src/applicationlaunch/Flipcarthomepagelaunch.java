package applicationlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcarthomepagelaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
		
		  chromeDriver.get("http://bing.com");
		  
		  chromeDriver.close();
		  
}
}