package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@Given("User should open Chrome Browser")
	public void user_should_open_chrome_browser()
	{
	System.setProperty("webdriver.chrome.driver", "./C:\\Users\\durga\\eclipse-workspace\\MyJavaProgram\\BrowserDriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	System.out.println(" *********** Chrome Browser launched Successfully *********** ");

	}

	@When("User enters valid URL Address")
	public void user_enters_valid_url_address()
	{
	driver.get(applicationUrlAddress);

	System.out.println(" ********** Navigated to OrangeHRM Application Web Page *********");

	}

	@Then("User should be able to successfully navigate to OrnageHRM Application LogIn Page")
	public void user_should_be_able_to_successfully_navigate_to_ornage_hrm_application_log_in_page()
	{
	// Validating OrangeHRM Application LogIn Page

	String expected_LogInPageText="LOGIN Panel";
	System.out.println(" The expected LogIn Page Text is :- "+expected_LogInPageText);

	By logInPanelProperty=By.id("logInPanelHeading");
	WebElement logInPanel=driver.findElement(logInPanelProperty);
	String actual_LogInPanelText=logInPanel.getText();
	System.out.println(" The actual LogIN Page text is :- "+actual_LogInPanelText);

	if(actual_LogInPanelText.equals(expected_LogInPageText))
	{
	System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page --- PASS");
	}
	else
	{
	System.out.println("Failed to Navigated to OrangeHRM Application LogIn Page --- FAIL ");
	}

	}

	@Then("User should close the OrnageHRM Application with the Browser")
	public void user_should_close_the_ornage_hrm_application_with_the_browser()
	{

	driver.quit();
	System.out.println(" **** Successfully Close the OrangeHRM Application with the Browser *************");

	}
	}

