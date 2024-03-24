package applicationlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmApplicationLaunch {
public static void main(String[] args) {
	

		System.out.println("hh");
		System.setProperty("webdriver.chrome.driver",".C:\\Users\\durga\\OneDrive\\Desktop\\driverfiles");
		
		ChromeDriver chromeDriver=new ChromeDriver();
		
 String apllicationurlAddress ="http://orangeHrm.com";
 
 chromeDriver.get(apllicationurlAddress);
 chromeDriver.manage().window().maximize();
 
}
}