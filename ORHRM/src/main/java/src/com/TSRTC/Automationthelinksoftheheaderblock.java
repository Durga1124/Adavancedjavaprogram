package com.TSRTC;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Automationthelinksoftheheaderblock {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	
	ChromeDriver chromeDriver=new ChromeDriver();
	
	chromeDriver.get("https://www.tsrtconline.in/oprs-web/"); 
	chromeDriver.manage().window().maximize();
	        
	
	        //identify the Headerblock of the webpage
			//class"menu wrap"-property of headerblock
			//<div class="menu-wrap">
			
			By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
			
			WebElement tsrtc_HeaderBlock=chromeDriver.findElement(tsrtc_HeaderBlockProperty);
			
			
			
			By tsrtc_HeaderBlocklinksProperty=By.tagName ("a");
			
		   //Automating about us element in the HeaderBlock.
		   //tsrtc_HeaderBlock.findElement(By.linkText("About Us")).click();
			
		  //Finding all the elements in the header Block
			
			List<WebElement>tsrtc_HeaderBlocklinks= tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlocklinksProperty);
			
			int tsrtc_HeaderBlocklinkscount=tsrtc_HeaderBlocklinks.size();
			
			System.out.println("The number of links in the headerblock of tsrtc Application:-"+tsrtc_HeaderBlocklinkscount);
			
			//getting the names of the links of the headerblock
			for(int index=0;index<tsrtc_HeaderBlocklinkscount;index++)
			{
			String tsrtc_HeaderBlocklinkName=tsrtc_HeaderBlocklinks.get(index).getText();
				
			System.out.println(index+""+tsrtc_HeaderBlocklinkName);
				
			tsrtc_HeaderBlocklinks.get(index).click();
			
			//when click operation is performed the driver focus will be moved to next page
			String actual_tsrtc_webpageTitle=chromeDriver.getTitle();
			System.out.println("The title of the webpage is :- "+actual_tsrtc_webpageTitle);
			
			String actual_tsrtc__WebpageCurrentUrlAddress=chromeDriver.getCurrentUrl();
			System.out.println("The Current Webpage Url Address is :-"+actual_tsrtc__WebpageCurrentUrlAddress);
			System.out.println();
			
			
			chromeDriver.navigate().back();
			
			String actual_tsrtc_WebpageCurrentUrlAddress=chromeDriver.getCurrentUrl();
			
			System.out.println("The Current Webpage Url Address is :-"+actual_tsrtc__WebpageCurrentUrlAddress);
			System.out.println();
			
			chromeDriver.navigate().back();
			
			tsrtc_HeaderBlock=chromeDriver.findElement(tsrtc_HeaderBlockProperty);
			
			tsrtc_HeaderBlocklinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlocklinksProperty);
			}
			chromeDriver.quit();
			
		
			
			}
}

