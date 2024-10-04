package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.FbLoginPojo;

import cucumber.api.java.en.*;

public class FbDefine extends BaseClass {

	public static FbLoginPojo f;

	@Given("To launch the chrome browser and hit the url")
	public void to_launch_the_chrome_browser_and_hit_the_url() {

		// browserLaunch();
		launchUrl("https://www.facebook.com/");
		// maxWin();
	}

	@When("To enter the invalide username in emailfield")
	public void to_enter_the_invalide_username_in_emailfield(io.cucumber.datatable.DataTable d) {
		f = new FbLoginPojo();

		Map<String, String> m = d.asMap(String.class, String.class);
		
		String text = m.get("username");

		fillText(f.getEmailId(), text);
		System.out.println("email id");
	}

	@When("To enter the valide password in password field")
	public void to_enter_the_valide_password_in_password_field(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		
		String text = m.get(2).get("pass1");

		WebElement p = f.getPasswordFiled();
		fillText(p, text);
		System.out.println("password id");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		btnClick(f.getLogin());
		System.out.println("login");

	}

	@Then("To close chrome browser")
	public void to_close_chrome_browser() {
		// browserClose();
	}

}
