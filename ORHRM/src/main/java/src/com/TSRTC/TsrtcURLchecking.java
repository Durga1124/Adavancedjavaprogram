package com.TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TsrtcURLchecking {
	
    public static void main(String[] args) {
    	
    	WebDriver driver;
    	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
    	
    	//Chrome Browser Automation
	    System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	
	    ChromeDriver Chromedriver=new ChromeDriver();
	
	Chromedriver.get(applicationUrlAddress);
     //Home
	 By homeElementProperty=By.linkText("Home");
	 WebElement homeElement=Chromedriver.findElement(homeElementProperty);
	 String homeHrefAttribute=homeElement.getAttribute("href");
	 String expected_HomeUrl=homeHrefAttribute;
	 System.out.println("Expected Home Url" +expected_HomeUrl);
	 
	 Chromedriver.findElement(By.linkText("Home")).click();
	 String actual_HomeCurrentUrlAddress=Chromedriver.getCurrentUrl();
	 System.out.println("Actual Home Url"  +actual_HomeCurrentUrlAddress);
	 
	 if(actual_HomeCurrentUrlAddress.contains(expected_HomeUrl))
		 
	 {
		 
	 System.out.println("Url Address matched-PASS");
	 
	 }
	 else
	 {
		 System.out.println("Url Address not  matched--FAIL");
	 }
	
	 //bus on Contract
	 By BusElementProperty=By.linkText("Bus on Contract");
	 WebElement BusElement=Chromedriver.findElement(BusElementProperty);
	 String busHrefAttribute=BusElement.getAttribute("href");
	 String expected_busUrl=busHrefAttribute;
	 System.out.println("Expected bus Url" +expected_busUrl);
	 
	 Chromedriver.findElement(By.linkText("Bus on Contract")).click();
	 String actual_busCurrentUrlAddress=Chromedriver.getCurrentUrl();
	 System.out.println("Actual bus Url"  +actual_busCurrentUrlAddress);
	 
	 if(actual_busCurrentUrlAddress.contains(expected_busUrl))
		 
	 {
		 
	 System.out.println("Url Address matched-PASS");
	 
	 }
	 else
	 {
		 System.out.println("Url Address not  matched--FAIL");
	 }
	 
	 //Enquiry
	 
	 By EnquiryElementProperty=By.linkText("Enquiry");
	 WebElement EnquiryElement=Chromedriver.findElement(EnquiryElementProperty);
	 String EnquiryHrefAttribute=EnquiryElement.getAttribute("href");
	 String expected_EnquiryUrl=EnquiryHrefAttribute;
	 System.out.println("Expected Enquiry Url" +expected_EnquiryUrl);
	 
	 Chromedriver.findElement(By.linkText("Enquiry")).click();
	 String actual_EnquiryCurrentUrlAddress=Chromedriver.getCurrentUrl();
	 System.out.println("Actual Enquiry Url"  +actual_EnquiryCurrentUrlAddress);
	 
	 if(actual_EnquiryCurrentUrlAddress.contains(expected_EnquiryUrl))
		 
	 {
		 
	 System.out.println("Url Address matched-PASS");
	 
	 }
	 else
	 {
		 System.out.println("Url Address not  matched--FAIL");
	 }
	 
	 //Cancel Tickets
	 
	 By CancelTicketsElementProperty=By.linkText("Cancel Tickets");
	 WebElement CancelTicketsElement=Chromedriver.findElement(CancelTicketsElementProperty);
	 String CancelTicketsHrefAttribute=CancelTicketsElement.getAttribute("href");
	 String expected_CancelTicketsUrl=CancelTicketsHrefAttribute;
	 System.out.println("Expected CancelTickets Url" +expected_CancelTicketsUrl);
	 
	 Chromedriver.findElement(By.linkText("Cancel Tickets")).click();
	 String actual_CancelTicketsCurrentUrlAddress=Chromedriver.getCurrentUrl();
	 System.out.println("Actual CancelTickets Url"  +actual_CancelTicketsCurrentUrlAddress);
	 
	 if(actual_CancelTicketsCurrentUrlAddress.contains(expected_CancelTicketsUrl))
		 
	 {
		 
	 System.out.println("Url Address matched-PASS");
	 
	 }
	 else
	 {
		 System.out.println("Url Address not  matched--FAIL");
	
    }
	 
	     //Cancel Services
	 
		 By CancelServicesElementProperty=By.linkText("Cancelled Services");
		 WebElement CancelledServicesElement=Chromedriver.findElement(CancelServicesElementProperty);
		 String CancelServicesHrefAttribute=CancelledServicesElement.getAttribute("href");
		 String expected_CancelServicesUrl=CancelServicesHrefAttribute;
		 System.out.println("Expected CancelServices Url" +expected_CancelServicesUrl);
		 
		 Chromedriver.findElement(By.linkText("Cancelled Services")).click();
		 String actual_CancelServicesCurrentUrlAddress=Chromedriver.getCurrentUrl();
		 System.out.println("Actual CancelServices Url"  +actual_CancelServicesCurrentUrlAddress);
		 
		 if(actual_CancelServicesCurrentUrlAddress.contains(expected_CancelServicesUrl))
			 
		 {
			 
		 System.out.println("Url Address matched-PASS");
		 
		 }
		 else
		 {
			 System.out.println("Url Address not  matched--FAIL");
		 
    
    }
		
		 //About Us
		 
		 By AboutUsElementProperty=By.linkText("About Us");
		 WebElement AboutUsElement=Chromedriver.findElement(AboutUsElementProperty);
		 String AboutUsHrefAttribute=AboutUsElement.getAttribute("href");
		 String expected_AboutUsUrl=AboutUsHrefAttribute;
		 System.out.println("Expected AboutUs Url" +expected_AboutUsUrl);
		 
		 Chromedriver.findElement(By.linkText("About Us")).click();
		 String actual_AboutUsCurrentUrlAddress=Chromedriver.getCurrentUrl();
		 System.out.println("Actual AboutUs Url"  +actual_AboutUsCurrentUrlAddress);
		 
		 if(actual_AboutUsCurrentUrlAddress.contains(expected_AboutUsUrl))
			 
		 {
			 
		 System.out.println("Url Address matched-PASS");
		 
		 }
		 else
		 {
			 System.out.println("Url Address not  matched--FAIL");
		 
    }
    
         // Tourism
		 
		 By TourismElementProperty=By.linkText("Tourism");
		 WebElement TourismElement=Chromedriver.findElement(TourismElementProperty);
		 String TourismHrefAttribute=TourismElement.getAttribute("href");
		 String expected_TourismUrl=TourismHrefAttribute;
		 System.out.println("Expected Tourism Url" +expected_TourismUrl);
		 
		 Chromedriver.findElement(By.linkText("Tourism")).click();
		 String actual_TourismCurrentUrlAddress=Chromedriver.getCurrentUrl();
		 System.out.println("Actual Tourism Url"  +actual_AboutUsCurrentUrlAddress);
		 
		 if(actual_AboutUsCurrentUrlAddress.contains(expected_AboutUsUrl))
			 
		 {
			 
		 System.out.println("Url Address matched-PASS");
		 
		 }
		 else
		 {
			 System.out.println("Url Address not  matched--FAIL");
		 
		 }
		       // Driver Info
		 
				 By DriverInfoElementProperty=By.linkText("Driver Info");
				 WebElement DriverInfoElement=Chromedriver.findElement(DriverInfoElementProperty);
				 String DriverInfoHrefAttribute=DriverInfoElement.getAttribute("href");
				 String expected_DriverInfoUrl=DriverInfoHrefAttribute;
				 System.out.println("Expected DriverInfo Url" +expected_TourismUrl);
				 
				 Chromedriver.findElement(By.linkText("Driver Info")).click();
				 String actual_DriverInfoCurrentUrlAddress=Chromedriver.getCurrentUrl();
				 System.out.println("Actual DriverInfo Url"  +actual_AboutUsCurrentUrlAddress);
				 
				 if(actual_AboutUsCurrentUrlAddress.contains(expected_AboutUsUrl))
					 
				 {
					 
				 System.out.println("Url Address matched-PASS");
				 
				 }
				 else
				 {
					 System.out.println("Url Address not  matched--FAIL");
    }
    
    }
    } 