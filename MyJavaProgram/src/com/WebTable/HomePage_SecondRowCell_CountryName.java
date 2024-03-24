package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage_SecondRowCell_CountryName extends BaseTest {

	   
public void Capturing_Worldclock_FirstCountryName() {
	 
	        // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]

			// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[3]

		    // locator - Xpath
	
	        // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]

		
WebElement FirstCountryNameProperty=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]"));


        String FirstCountryName=FirstCountryNameProperty.getText();
        System.out.println(FirstCountryName);
	    }
	    
	    public static void main(String[] args) {
			
	    	HomePage_SecondRowCell_CountryName FirstCountryName=new HomePage_SecondRowCell_CountryName();
	    	
	    	FirstCountryName.applicationLaunch();
	    	
	    	FirstCountryName.Capturing_Worldclock_FirstCountryName();
	    	
	    	FirstCountryName.applicationclose();
}
}

