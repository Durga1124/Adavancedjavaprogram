package com.Screeenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;


public class screenshot_BingHomePageextendsBaseTestt {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chrome_driver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	  driver.get("http://bing.com");
	  
	  
	  
	// File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(screenshot,new File("./BingApplicationscreenshot/BingHomepagescreenshot.png"));
	 
	 
	 File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFile(screenshot,new File("./BingApplicationscreenshot/BingHomepagescreenshot.png"));
}

}