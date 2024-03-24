package com.Testing;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features="OrangeHRM",//folder name in which feature file is saved
glue="stepDefnation",
monochrome=true // will remove the junk data from the OutPut result
        )

public class TestRunner {


}
