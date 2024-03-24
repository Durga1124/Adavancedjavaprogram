package com.TestNG;

import java.io.FileInputStream;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ohrm {

	
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chrome_driver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	@AfterTest
	public void teardown() {
	//	driver.quit();
		
	}
	
	@Test(priority=1)
	public void AddEmployee() throws IOException {
		
		
		FileInputStream ExcelTestData=new FileInputStream("C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\src\\com\\exceltestdata\\OHRM_LOGIN_IMAGE_UPLOAD.xlsx");
		XSSFWorkbook testdataworkbook=new XSSFWorkbook(ExcelTestData);
		XSSFSheet testdatasheet=testdataworkbook.getSheet("Sheet1");
		Row testdatarow =testdatasheet.getRow(0);
	Cell rowofcell=testdatarow.getCell(0);
	String usernametestdata=rowofcell.getStringCellValue();
	System.out.println(usernametestdata);
	
	//inspecting xpath of user name
	//html/body/div[1]/div/div[2]/form/div[2]/input
	
	
By	usernameproperty=By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/input");
WebElement username=driver.findElement(usernameproperty);
username.sendKeys(usernametestdata);

//inspecting xpath of password property
//html/body/div[1]/div/div[2]/form/div[3]/input
By passwordproperty=By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/input");
WebElement password=driver.findElement(passwordproperty);
password.sendKeys(usernametestdata);

//inspecting xpath of login property
///html/body/div[1]/div/div[2]/form/div[5]/input



	
		
	}
}
