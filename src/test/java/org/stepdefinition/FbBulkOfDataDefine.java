package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.FbLoginPojo;

import cucumber.api.java.en.*;
public class FbBulkOfDataDefine extends BaseClass{
	public static FbLoginPojo f;
	@Given("launch the chrome browser and hit the url")
	public void launchTheChromeBrowserAndHitTheUrl() {
		//browserLaunch();
		launchUrl("https://www.facebook.com/");
		//maxWin();
	   
	}

	@When("enter the invalide username {string} in emailfield")
	public void enterTheInvalideUsernameInEmailfield(String email) {
		f = new FbLoginPojo();
		WebElement e = f.getEmailId();
		fillText(e, email);
	}

	@When("enter the valide password {string} in password field")
	public void enterTheValidePasswordInPasswordField(String password) {
		
		WebElement p = f.getPasswordFiled();
		fillText(p, password);
	   
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		btnClick(f.getLogin());
		System.out.println("login");
	   
	}

	@Then("close chrome browser")
	public void closeChromeBrowser() {
		//browserClose();
	}
}
