package amazonapplicationfunctionlity;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;


public class Amazon_YoursWishList_UnderHelloSignin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
		
	String ApplicationUrlAddress="https://www.amazon.in/";
	chromeDriver.get(ApplicationUrlAddress);
	
	chromeDriver.manage().window().maximize();
	
//	<span id="nav-link-accountList-nav-line-1" class="nav-line-1"
			//+ " nav-progressive-content">Hello, sign in</span>
	By HellosignInlocator=By.id("nav-link-accountList");
	WebElement hellosign=chromeDriver.findElement(HellosignInlocator);
	//<span class="nav-text">Your Orders</span>
	
	Actions action=new Actions(chromeDriver);
	action.moveToElement(hellosign).build().perform();
	By yourorderlocator = By.linkText("Your Orders");
	
	WebElement YourOrders=chromeDriver.findElement(HellosignInlocator);
	
	YourOrders.click();
	
	
	
	
	
}
}