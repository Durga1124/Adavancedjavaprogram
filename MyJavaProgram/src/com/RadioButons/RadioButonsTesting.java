package com.RadioButons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButonsTesting {

	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void setUp()
	{

	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}

	@Test(priority=1,description=" Group1 Radio Buttons Validation")
	public void group1RadioButtonsTestingn() throws InterruptedException
	{
	/*
		<input type="radio" name="group1" value="Milk">
		<input type="radio" name="group1" value="Butter" checked="">
		<input type="radio" name="group1" value="Cheese">

		<input type="radio" name="group2" value="Water">
		<input type="radio" name="group2" value="Beer">
		<input type="radio" name="group2" value="Wine" checked="">
    */
	
		// Identifying the Radio Buttons Block
		///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
	
	  By radioButtonsBlockProperty=By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
	  WebElement radioButtonsBlock=driver.findElement(radioButtonsBlockProperty);
		
	// identifying the Group1 elements of the Radio Buttons Block
	  By group1RadioButtonsProperty=By.name("group1");
	  List<WebElement>group1RadioButtons=radioButtonsBlock.findElements(group1RadioButtonsProperty);
	  
	  System.out.println("The number of Radion Buttons in Group1 are :- "+group1RadioButtons.size());
	  
	  // To perform Click on each Radion Button
	  for(int radioButtonClick=0;radioButtonClick<group1RadioButtons.size();radioButtonClick++)
	  {
	  group1RadioButtons.get(radioButtonClick).click();
	  
	  
	// getting the status of every Radio Button when clicked
	 for(int radioButtonsStatus=0; radioButtonsStatus<group1RadioButtons.size();radioButtonsStatus++ ) 
	 {
		String group1RadioButtonsName=group1RadioButtons.get(radioButtonsStatus).getAttribute("value")+""+group1RadioButtons.get(radioButtonsStatus).getAttribute("checked");
	   
		System.out.println(group1RadioButtonsName);	  
	 }
	 System.out.println();
	 Thread.sleep(5000);
	

	  



	  }
	  

	}
}







