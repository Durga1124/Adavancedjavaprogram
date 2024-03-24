package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



//@RunWith(Cucumber.class)
  @RunWith(cucumber.class)
	@CucumberOptions(features="OrangeHRMApplication",//folder name in which feature file is saved
	 glue="stepDefination", // will connect the feature file statements with
	                       // the selenium Script ( User defined methods for the
	                 //  english language statements to perform those activities)
	 monochrome=true // will remove the junk data from the OutPut result
	                 )

	public class TestRunner {

	// Connecting the Feature file with the Selenium automation Test Script
}
