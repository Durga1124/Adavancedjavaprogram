package applicationlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmApplicationLaunch {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
		
 String apllicationurlAddress ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
 
 chromeDriver.get(apllicationurlAddress);
 chromeDriver.manage().window().maximize();
 
}
}