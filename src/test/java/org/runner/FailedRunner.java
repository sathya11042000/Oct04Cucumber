package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\ADMIN\\eclipse-workspace\\11CucumberBatch\\Feature\\failed.txt",
glue = "org.stepdefinition")



public class FailedRunner {

}
