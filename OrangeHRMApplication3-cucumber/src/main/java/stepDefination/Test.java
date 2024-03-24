package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;

public class Test {
@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",//folder name in which feature file is saved
glue="stepDefination",
monochrome=true // will remove the junk data from the OutPut result
        )

public class TestRunner {

// Connecting the Feature file with the Selenium automation Test Script

}
}