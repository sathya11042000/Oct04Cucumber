package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before(order = 6)
	public void beforeScenario1() {
		browserLaunch();

	}

	@Before(order = 88)
	public void beforeScenario2() {
		getDateAndTime();

	}

	@Before(order = 44)
	public void beforeScenario3() {
		maxWin();

	}

	@After(order = 60)
	public void afterScenario4(Scenario s) {
		
		System.out.println("take screen shot>>>>");
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] f = ts.getScreenshotAs(OutputType.BYTES);
		
		if (s.isFailed()) {
			
			s.embed(f, "amazon");
			
		}
		
		

	}

	@After(order = 40)
	public void afterScenario3() {
		browserClose();

	}

}
