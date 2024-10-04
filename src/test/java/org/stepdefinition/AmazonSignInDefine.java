package org.stepdefinition;

import org.helper.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.AmazonLogin;

import cucumber.api.java.en.*;

public class AmazonSignInDefine extends BaseClass {
	public static AmazonLogin a;

	@Given("Launch the chrome browser and hit the amazon url")
	public void launch_the_chrome_browser_and_hit_the_amazon_url() {
		//browserLaunch();
		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//maxWin();
	}

	@When("To send the username or mobile number in enmaild field")
	public void to_send_the_username_or_mobile_number_in_enmaild_field() {
		a = new AmazonLogin();
		WebElement e = a.getTextEmail();
		fillText(e, "8524046025");

	}

	@When("To click continue button")
	public void to_click_continue_button() {
		WebElement conBtn = a.getConBtn();
		btnClick(conBtn);
	}

	@When("To send the password in password field")
	public void to_send_the_password_in_password_field() {
           WebElement p = a.getTextPass(); 
           fillText(p, "sathya");//actual
           //getAttribute("value")-->sathya
           Assert.assertEquals("12345",p.getAttribute("value"));
           System.out.println("amazon password passed>>>");
	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
		WebElement signInBtn = a.getSignInBtn();
		btnClick(signInBtn);

	}

	@Then("To close the amazon page browser")
	public void to_close_the_amazon_page_browser() {
		//browserClose();
	}

}
