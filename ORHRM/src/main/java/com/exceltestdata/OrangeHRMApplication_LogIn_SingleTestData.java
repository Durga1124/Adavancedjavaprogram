package com.exceltestdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OrangeHRMApplication_LogIn_SingleTestData {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	
	// ChromeDriver driver = new ChromeDriver();
	// OR
	// WebDriver - its an interface in selenium

	//WebDriver driver = new ChromeDriver();
	              // OR
	WebDriver driver;
	driver=new ChromeDriver();
 String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();
	
	// implicitlyWait - is a Global wait / smart wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//<input name="txtUsername" id="txtUsername" type="text">
	// driver.findElement(By.id("txtUsername")).sendKeys("durga123");

	                // OR

	// identifying the Element on the WebPage - with the Property
	// Identified Element is assigned to a variable
	// The variable is getting saved with an identified element on the WebPage - declaration
//	    should be as of Type WebElement
	//WebElement userName=driver.findElement(By.id("txtUsername"));
	// userName.sendKeys("durga123");

	// OR

	FileInputStream orangeHRMLogInTestDataFile= new FileInputStream("./src/com/TestData/multipletestdataexcelsheet.xlsx"
			+ "");
	
	XSSFWorkbook logInTestDataWorkBook = new XSSFWorkbook(orangeHRMLogInTestDataFile);
	
	XSSFSheet logInTestDataWorkBookSheet = logInTestDataWorkBook.getSheet("sheet1");
	
	Row testdataRow=logInTestDataWorkBookSheet.getRow(1);
	
	Cell userNameTestDataCell=testdataRow.getCell(0);
	
	String userNameTestData=userNameTestDataCell.getStringCellValue();
	System.out.println("The UserName Test Data is :- "+userNameTestData);

	// String userNameTestData="durga123";
	
	By userNameProperty=By.id("txtUsername");
	
	WebElement userName=driver.findElement(userNameProperty);
	
	userName.clear();
	userName.sendKeys(userNameTestData);
	
	Cell passwordTestdataCell=testdataRow.getCell(1);
	String passwordTestData=passwordTestdataCell.getStringCellValue();
	
	System.out.println(" The UserName Test Data is :- "+passwordTestData);
	


		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	    // driver.findElement(By.id("txtPassword")).sendKeys("Durg@123");
	
        By passwordproperty=By.name("txtPassword");
        WebElement password=driver.findElement(passwordproperty);
        
        password.clear();
        password.sendKeys(passwordTestData);

        
        //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
         By logInPageLogInButtonProperty=By.className("button");
        WebElement logInPageLogInButton=driver.findElement(logInPageLogInButtonProperty);       
        logInPageLogInButton.click();
        
        //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
        By homePageWelComeAdminProperty=By.id("welcome");
        WebElement homePageWelComeAdmin=driver.findElement(homePageWelComeAdminProperty);
     
        Cell expectedHomePageTextCell=testdataRow.getCell(2);
        String expectedHomePageText=expectedHomePageTextCell.getStringCellValue();
        
        String expected_OrangeHRMApplicationHomePageText=expectedHomePageText;
        System.out.println(" The expected Text of OrangeHRM Application HomePage is :-"+expected_OrangeHRMApplicationHomePageText);
        
        String actual_OrangeHRMApplicationHomePageText=homePageWelComeAdmin.getText();
        System.out.println(" The actual Text of OrangeHRM Application HomePage is :-"+actual_OrangeHRMApplicationHomePageText);		
        
        if (actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText)) {
			
		
        System.out.println(" Successfully Navigated to OrangeHRM Application Home Page - PASS");
        
        // Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
        Cell testResultRowCell=testdataRow.createCell(3);
        testResultRowCell.setCellValue("Successfully Navigated to OrangeHRM Application Home Page - PASS");
	          }
	
	      else
	   {
	    System.out.println(" Failed to Navigated to OrangeHRM Application Home Page - FAIL");
	    
	    // Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
	    Cell testresultrowofCell=testdataRow.createCell(3);
	    testresultrowofCell.setCellValue("Failed to Navigated to OrangeHRM Application Home Page - FAIL");
	   }  
   
        
        //src/com/TestData/OrangeHRMApplicationTestResultFiles.xlsx
        
        FileOutputStream testDataResultFile = new FileOutputStream("C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\src\\com\\TestData\\multipletestdataexcelsheet.xlsx");
        logInTestDataWorkBook.write(testDataResultFile);

        homePageWelComeAdmin.click();

        // Synchronization
        //Thread.sleep(5000); // Java Wait
        
       // <li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>

        
        By homePageLogOutProperty=By.linkText("Logout");

      
        WebElement homePageLogOut=driver.findElement(homePageLogOutProperty);
        homePageLogOut.click();

        driver.quit();


        }

} 
        
	

	
	
	
	
	
	
	

	
	
	

