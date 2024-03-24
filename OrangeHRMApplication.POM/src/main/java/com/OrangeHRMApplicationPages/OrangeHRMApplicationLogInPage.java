package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplicationLogInPage extends BaseTest {
	
	public OrangeHRMApplicationLogInPage() // it is a Constructor
	{
	PageFactory.initElements(driver, this);
	}


	// Object Repository Class

	// <div id="logInPanelHeading">LOGIN Panel</div>
	// <div id="logInPanelHeading">LOGIN Panel</div>

	// By logInPanelProperty=By.id("logInPanelHeading");
	// WebElement logInPanel=driver.findElement(logInPanelProperty);

	// 1. Identification of the Element on the WebPage
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;

	@FindBy(id="txtUsername")
	WebElement userName;

	@FindBy(name="txtPassword")
	WebElement password;

	@FindBy(className="button")
	WebElement logInButton;

	// 2. Creating a user-defined method / Business Logic to perform Operation on the element
	public void logInPanelTextValidation()
	{
	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The expected text of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
	System.out.println(" The actual text of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" OrangeHRM Application LogIn Page Text is as expected - PASS ");
	}
	else
	{
	System.out.println(" OrangeHRM Application LogIn Page Text is NOT as expected - FAIL ");
	}

	}

	public void validatinglogInFunctionality(String UserName,String Password)
	{
	userName.sendKeys(UserName);
	password.sendKeys(Password);
	logInButton.click();
	}


	}



