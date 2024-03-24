package com.WebTable;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
		
    WebDriver driver;
   
		  String applicationUrlAddress=("https://www.timeanddate.com/worldclock/");
		 
		  public void applicationLaunch() {
			  
		  
		  System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	
          driver=new ChromeDriver();
          driver.get(applicationUrlAddress);
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  }
          public void applicationclose() {
        	  driver.quit();
          }
          
          
}
