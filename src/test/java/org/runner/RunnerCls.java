package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition",
plugin = {"html:target","junit:JunitF//junitFile.xml","json:JsonF//jsonFile.json","rerun:Feature//failed.txt"})

//plugin={" "," "," "}

public class RunnerCls {
	
	
	@AfterClass
	public static void afterCls_tc() {
	
		JvmReport.generateJvmReport("C:\\Users\\ADMIN\\eclipse-workspace\\11CucumberBatch\\JsonF\\jsonFile.json");

	}
	
	
	

}