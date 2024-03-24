package com.TSRTC;


import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tsrtc{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
	
		chromeDriver.get("https://www.tsrtconline.in/oprs-web/"); 
		
		
		
		
 /*By busoncontractproperty=By.linkText("Bus on Contract");
  
 WebElement busoncontract=chromeDriver.findElement(busoncontractproperty);
  
  busoncontract.click();
  */
		By linksproperty=By.tagName("a");
		
		
	List <WebElement> tsrtc_Homepagelinknames=chromeDriver.findElements(linksproperty);
		
	    int tsrtc_HomePageLinkscount=tsrtc_Homepagelinknames.size();
		
 System.out.println("The number of links on the TSRTC Homepage are:-"  +tsrtc_HomePageLinkscount);
		
				
		for(int index=0; index<tsrtc_HomePageLinkscount;index++)
		{
			String linkName=tsrtc_Homepagelinknames.get(index).getText();
		System.out.println(index+""+linkName);
		}
		
		chromeDriver.quit();
		
			
	}
}	
		
		
