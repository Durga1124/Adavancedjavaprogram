
package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\BrowserDriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" ************ chrome Browser Launched Successfully ******** ");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get(applicationUrlAddress);

	System.out.println(" Successfully navigated to OrangeHRM Application Url WebPage");

	}

	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	System.out.println(" *********** Successfully Closed the OrangeHRM Application and the Browser ********** ");
	}


	}

