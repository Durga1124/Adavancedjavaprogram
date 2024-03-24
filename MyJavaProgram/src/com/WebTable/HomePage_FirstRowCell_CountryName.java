package com.WebTable;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage_FirstRowCell_CountryName extends BaseTest {



	    public void Capturing_Worldclock_FirstCountryName() {
	
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

		// locator - Xpath
		// selector - /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
WebElement FirstCountryNameProperty=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
         
        String FirstCountryName=FirstCountryNameProperty.getText();
        System.out.println(FirstCountryName);
	    }
	    
	    public static void main(String[] args) {
			
	    	HomePage_FirstRowCell_CountryName FirstCountryName=new HomePage_FirstRowCell_CountryName();
	    	
	    	FirstCountryName.applicationLaunch();
	    	
	    	FirstCountryName.Capturing_Worldclock_FirstCountryName();
	    	
	    	FirstCountryName.applicationclose();
	    	
		}
        
}   
        