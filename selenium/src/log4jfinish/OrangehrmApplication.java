package log4jfinish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OrangehrmApplication {
	
@Test
public void Application() throws InterruptedException {
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");

	driver = new ChromeDriver(); // Automate browser

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login"); // navigate orangehrm login page

	String ExpectedTitle_OrangeHRM_LoginPage="OrangeHRM"; // Expected title

	System.out.println("Expected Title of Orange HRM loginpage is: "+ExpectedTitle_OrangeHRM_LoginPage);
Log.info("Expected Title of Orange HRM loginpage is: "+ExpectedTitle_OrangeHRM_LoginPage);
	String ActualTitle_OrangeHRM_LoginPage=driver.getTitle();

	System.out.println("Actual Title of Orange HRM loginpage is: "+ActualTitle_OrangeHRM_LoginPage);
   Log.info("Actual Title of Orange HRM loginpage is: "+ActualTitle_OrangeHRM_LoginPage);

	if (ActualTitle_OrangeHRM_LoginPage.equals(ExpectedTitle_OrangeHRM_LoginPage)) {

	System.out.println("Both Actual and Expected Titles of OrangeHRM login page are same - PASS");
  Log.info("Both Actual and Expected Titles of OrangeHRM login page are same - PASS");
	}

	else {

	System.out.println("Both Actual and Expected Titles of OrangeHRM login page are NOT same - FAIL");
  Log.info("Both Actual and Expected Titles of OrangeHRM login page are NOT same - FAIL");
	}


	String ExpectedUrlAddress_OrangeHRM_LoginPage="orangehrm-4.2.0.1"; // Expected Url address

	System.out.println("Expected Url Address of Orange HRM loginpage is: "+ExpectedUrlAddress_OrangeHRM_LoginPage);
    Log.info("Expected Url Address of Orange HRM loginpage is: "+ExpectedUrlAddress_OrangeHRM_LoginPage);
	String ActualUrlAddress_OrangeHRM_LoginPage=driver.getCurrentUrl();

	System.out.println("Actual Url Address of Orange HRM loginpage is: "+ActualUrlAddress_OrangeHRM_LoginPage);
  Log.info("Actual Url Address of Orange HRM loginpage is: "+ActualUrlAddress_OrangeHRM_LoginPage);

	if (ActualUrlAddress_OrangeHRM_LoginPage.contains(ExpectedUrlAddress_OrangeHRM_LoginPage)) {

	System.out.println("Its a Login Page of OrangeHRM Application - PASS");
  Log.info("Its a Login Page of OrangeHRM Application - PASS");
	}

	else {

	System.out.println("Its NOT a Login Page of OrangeHRM Application - FAIL");
  Log.info("Its NOT a Login Page of OrangeHRM Application - FAIL");
	}


	//<div id="logInPanelHeading">LOGIN Panel</div>

	By loginPanelL=By.id("logInPanelHeading");

	WebElement loginPanel=driver.findElement(loginPanelL);


	String ExpectedText_loginPanel="LOGIN Panel"; // Expected text - LOGIN Panel

	System.out.println("Expected Text of login panel of orangeHRM Login page is: "+ExpectedText_loginPanel);
  Log.info("Expected Text of login panel of orangeHRM Login page is: "+ExpectedText_loginPanel);

	String ActualText_loginPanel=loginPanel.getText();

	System.out.println(" Actual Text of login panel of orangeHRM Login page is: "+ActualText_loginPanel);
Log.info(" Actual Text of login panel of orangeHRM Login page is: "+ActualText_loginPanel);

	if (ActualText_loginPanel.equals(ExpectedText_loginPanel)) {

	System.out.println("Actual and Expected Texts of LOGIN Panel of orangeHRM Login page are same - PASS");
   Log.info("Actual and Expected Texts of LOGIN Panel of orangeHRM Login page are same - PASS");
	}

	else {

	System.out.println("Actual and Expected Texts of LOGIN Panel of orangeHRM Login page are NOT same - FAIL");
  Log.info("Actual and Expected Texts of LOGIN Panel of orangeHRM Login page are NOT same - FAIL");
	}


	// login with valid data


	//<input name="txtUsername" id="txtUsername" type="text">

	By usernameL=By.id("txtUsername");

	WebElement username=driver.findElement(usernameL);

	username.sendKeys("durga123");

	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

	By passwordL=By.id("txtPassword");

	WebElement password=driver.findElement(passwordL);

	password.sendKeys("Durg@123");


	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	By loginL=By.id("btnLogin");

	WebElement login=driver.findElement(loginL);

	login.click();


	//Expected text - Admin

	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	String ExpectedText_WelcomeAdmin="Admin";

	System.out.println("Expected Text of WelcomeAdmin is: "+ExpectedText_WelcomeAdmin);
 Log.info("Expected Text of WelcomeAdmin is: "+ExpectedText_WelcomeAdmin);

	By AdminL=By.id("welcome");

	WebElement Admin=driver.findElement(AdminL);

	String ActualText_WelcomeAdmin=Admin.getText();

	System.out.println("Actual Text of WelcomeAdmin is: "+ActualText_WelcomeAdmin);
Log.info("Actual Text of WelcomeAdmin is:" +ActualText_WelcomeAdmin);


	if (ActualText_WelcomeAdmin.contains(ExpectedText_WelcomeAdmin)) {

	System.out.println("Actual Text of WelcomeAdmin contains Expected Text of WelcomeAdmin - PASS");
Log.info("Actual Text of WelcomeAdmin contains Expected Text of WelcomeAdmin - PASS");
	}

	else {

	System.out.println("Actual Text of WelcomeAdmin does not contains Expected Text of WelcomeAdmin - FAIL");
Log.info("Actual Text of WelcomeAdmin does not contains Expected Text of WelcomeAdmin - FAIL");
	}


	// Logout

	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	Admin.click();

	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	By logoutL=By.linkText("Logout");

	WebElement logout=driver.findElement(logoutL);

	logout.click();

	Thread.sleep(2000);

	//validate login page again (after logout it navigate to login page or not)

	loginPanel=driver.findElement(loginPanelL);

	ExpectedText_loginPanel=loginPanel.getText();

	System.out.println("Expected Text of login panel of orangeHRM Login page is: "+ExpectedText_loginPanel);
   Log.info("Expected Text of login panel of orangeHRM Login page is: \"+ExpectedText_loginPanel");

	driver.quit();

}
	
}
