package com.OrangeHRMApplicationPagesTestCases;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationLogInPage;

public class OrangeHRMApplicationLogInPageTest extends BaseTest {

	OrangeHRMApplicationLogInPage logInPage;

	@Test(priority=1,description=" Validating OrangeHRM Application LogIn Page Text ")
	public void logInPanelTextValidationTest()
	{
	logInPage = new OrangeHRMApplicationLogInPage();
	logInPage.logInPanelTextValidation();//logInPanelTextValidationTest();

	}

	@Test(priority=2,description=" Validating OrangeHRM Application LogIn Page LogIn Funcationality ")
	public void validatinglogInFunctionalityTest()
	{
	logInPage=new OrangeHRMApplicationLogInPage();
	logInPage.logInPanelTextValidation();
	System.out.println(" Successfully Navigated to OrangeHRM Application HomePage ");
	}


	}


