package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {

	@Test(priority=1,description=" Gmail Application Launch FunctionalityTest")
	public void GmailApplicationLaunch() {
		
		System.out.println("********Gmail Functionality successful********");
		
		
	}
	@Test(priority=3,description="Gmail InBox Functionality Test")
	public void inBoxTest()
	{
	System.out.println(" ******** Gmail Application InBox Functionality Test Successfull ***********");
	}
	@Test(priority=4,description="Gmail composeMail Functionality Test")
	public void composeMailTest()
	{
	System.out.println(" ********** Gmail Application ComposeMail Functionality Test Successfull ***********");
	}

	@Test(priority=2,description="Gmail LogIn Functionality Test")
	public void LogInTest()
	{
	System.out.println(" ********** Gmail Application LogIn Functionality Test Successfull ********");
	}


	@Test(enabled=false,description="Gmail Drafts Functionality Test") // This Test case is a False Test case - TestNG Ignores the current
	                    //     Test case during the Test Run
	                    //   The default Status of the Test Case is - enabled=true
	public void DraftsTest()
	{
	System.out.println(" ********** Gmail Application Drafts Functionality Test Successfull ********");
	}

	@Test(priority=5,description="Gmail SentMail Functionality Test")
	public void SentMailTest()
	{
	System.out.println(" ********** Gmail Application SentMail Functionality Test Successfull ********");
	}


	// @Test - it represents to a test case
	// any functionality which is under Test should be always be written using TestNG
//	        Annotation @Test
	// The User Defined name which is implemented with @Test is referred to as a Test case Name
	// Once Java Class can have any number of Test cases
	// Test Cases always executes in the Alphabetical Order of the Given Test Case Name
	// If a Class contains many Test Cases - the test cases always executes based on the
//	     alphabetical order starting with Upper Case Letter - and will follow then the
//	     lower case letter of the given Test case Name





}

