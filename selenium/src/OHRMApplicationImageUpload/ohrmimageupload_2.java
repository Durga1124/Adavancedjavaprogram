package OHRMApplicationImageUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ohrmimageupload_2 {

	WebDriver driver;

	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";



	

	@BeforeTest

	public void setup()

	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\BrowserDriverFiles\\chromedriver.exe");	



	driver=new ChromeDriver();

	

	driver.get(applicationURLAddress);

	

	driver.manage().window().maximize();

	

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}



	@AfterTest

	public void teardown()

	{

	//	driver.quit();

	}



	@Test

	public void addEmployee() throws IOException, InterruptedException

	{

		FileInputStream excelTestData= new FileInputStream("C:\\\\Users\\\\durga\\\\eclipse-workspace\\\\selenium\\\\src\\\\com\\\\TestData\\\\OHRM_LOGIN_IMAGE_UPLOAD.xlsx");
		
		XSSFWorkbook testDataWorkBook=new XSSFWorkbook(excelTestData);

		XSSFSheet testDataSheet= testDataWorkBook.getSheet("sheet1");

		

	// for UserName TestData	

		Row testDataRow=testDataSheet.getRow(0);

		Cell rowOfCellUserName=testDataRow.getCell(0);

		String userNameTestData=rowOfCellUserName.getStringCellValue();

		System.out.println(userNameTestData);

	

	// inspecting Xpath of UserName

	// /html/body/div[1]/div/div[2]/form/div[2]/input

	 By	userNameProperty=By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/input");

	WebElement userName=driver.findElement(userNameProperty);

	userName.sendKeys(userNameTestData);

	



	// for Password TestData	

		Cell rowOfCellPassword=testDataRow.getCell(1);

		String passwordTestData=rowOfCellPassword.getStringCellValue();

		System.out.println(passwordTestData);

	

		// inspecting Xpath of Password

		// /html/body/div[1]/div/div[2]/form/div[3]/input

		By	passwordProperty=By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/input");

		WebElement password=driver.findElement(passwordProperty);

		password.sendKeys(passwordTestData);

		
		

		// inspecting Xpath of Login

		// /html/body/div[1]/div/div[2]/form/div[5]/input

		By	logInProperty=By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/input");

		WebElement logIn=driver.findElement(logInProperty);

		logIn.click();

		

		// inspecting "PIM" Element in OHRM Homepage HeaderBlock

		// /html/body/div[1]/div[2]/ul/li[2]/a/b

	By	pimProperty=By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b");
	
	WebElement	pim=driver.findElement(pimProperty);

		

	// performing MouseHover on "pim" Element

		Actions actions=new Actions(driver);

		actions.moveToElement(pim).build().perform();

		

		// inspecting AddEmployee element 

		// /html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a

			By addEmployeeProperty=By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]/a");
			
			WebElement	addEmployee=driver.findElement(addEmployeeProperty);

			addEmployee.click();

	

	// Reading FirstName Data from Excel

Row firstNameRow=testDataSheet.getRow(1);

Cell rowOfCellFirstName=firstNameRow.getCell(0);

String firstNameTestData=rowOfCellFirstName.getStringCellValue();

System.out.println(firstNameTestData);

	



// inspecting AddEmployee First Name

// id = firstName

By firstNameProperty=By.id("firstName");

WebElement	firstName=driver.findElement(firstNameProperty);



// Sending TestData into FirstName

firstName.sendKeys(firstNameTestData);



//performing "TAB" Operation for moving to "Middle Name"

		Actions actionMiddleName=new Actions(driver);

		actionMiddleName.sendKeys(Keys.TAB).build().perform();	

		



		// Reading MiddleName Data from Excel

	Cell rowOfCellMiddleName=firstNameRow.getCell(1);

	String middleNameTestData=rowOfCellMiddleName.getStringCellValue();

	System.out.println(middleNameTestData);

		



	// inspecting AddEmployee Middle Name

	// id = middleName

	By middleNameProperty=By.id("middleName");

	WebElement	middleName=driver.findElement(middleNameProperty);



	// Sending TestData into MiddleName

	middleName.sendKeys(middleNameTestData);



	//performing "TAB" Operation for moving to "Last Name"

			Actions actionLastName=new Actions(driver);

			actionLastName.sendKeys(Keys.TAB).build().perform();

			

			

			// Reading Last Data from Excel

			Cell rowOfCellLastName=firstNameRow.getCell(2);

			String lastNameTestData=rowOfCellLastName.getStringCellValue();

			System.out.println(lastNameTestData);

				



			// inspecting AddEmployee Last Name

			// id = lastName

			By lastNameProperty=By.id("lastName");

			WebElement	lastName=driver.findElement(lastNameProperty);



			// Sending TestData into LastName

			lastName.sendKeys(lastNameTestData);



			//performing "TAB" Operation for moving to "Employee ID"

			Actions actionEmployeeId=new Actions(driver);

			actionEmployeeId.sendKeys(Keys.TAB).build().perform();

			

			// Inspecting "Employee ID"

			// <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">

	By	employeeIdProperty=By.name("employeeId");

	WebElement	employeeId= driver.findElement(employeeIdProperty);

	

// here we take Attribute Value because we need to take "0001" from OHRM Emp Id, so we need to use "get Attribute" Method

	String	employeeIdValue=employeeId.getAttribute("value");

	System.out.println(employeeIdValue);

	

	// writing "employeeIdValue" into Excel

	Row empIdValueRow=testDataSheet.createRow(2);

	Cell rowOfCellEmpId=empIdValueRow.createCell(3);

 	rowOfCellEmpId.setCellValue(employeeIdValue);


 	

 	actionEmployeeId.sendKeys(Keys.TAB).build().perform();

 	
 	Thread.sleep(2000);

 	Actions actionphotoGraph=new Actions(driver);

 	actionphotoGraph.sendKeys(Keys.ENTER).build().perform();
 	Thread.sleep(2000);
 
     java.lang.Runtime.getRuntime().exec("C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\autoitupload.exe");
     
    //<input type="button" class="" id="btnSave" value="Save">
    // /html/body/div[1]/div[3]/div/div[2]/form/fieldset/p/input
     
     By saveButtonProperty=By.id("btnSave");
     WebElement saveButton=driver.findElement(saveButtonProperty);
     saveButton.click();
     
     By employeePhotographProperty=By.id("empPic");
     WebElement employeePhotograph=driver.findElement(employeePhotographProperty);

     boolean flag=employeePhotograph.isDisplayed();

     if(flag)
     {
     System.out.println(" Employee Photograph Successfully Uploaded to the OrangeHRM Application ");
     }
     else
     {
     System.out.println(" Employee Photograph Failed to Upload to the OrangeHRM Application ");
     }

    
}
}
