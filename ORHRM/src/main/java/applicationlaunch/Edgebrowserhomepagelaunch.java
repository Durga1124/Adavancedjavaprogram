package applicationlaunch;

import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowserhomepagelaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./BrowserDriverFiles/msedgedriver.exe");
	
	EdgeDriver edgeDriver=new EdgeDriver();
	 
	 edgeDriver.get("http://Livetech.in");
	 
	 edgeDriver.quit();
}
}
