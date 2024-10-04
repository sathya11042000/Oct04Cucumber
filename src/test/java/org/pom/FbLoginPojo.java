package org.pom;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
//adactin hotel page-->mini project
public class FbLoginPojo extends BaseClass {
	
	public FbLoginPojo() {
		PageFactory.initElements(driver,this);
	}
	
	// WebElement emailId =driver.findElement(By.id("email"));
  //login page
	
	@CacheLookup
	@FindBy(id = "email")
	public WebElement emailId;

    @CacheLookup
	@FindBy(id = "pass")
	public WebElement passwordFiled;
	
	//OR
    @CacheLookup
	@FindAll(
			{
					@FindBy(name ="login")	,
					@FindBy(xpath = "//button[@type='ubmit']"),//f
					@FindBy(xpath = "//button[text()='Log out']") //f
				
			}
			
			)
	public WebElement login;
	
	//right click-->source-->generate getters & setters-->select getters-->generate
	
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPasswordFiled() {
		return passwordFiled;
	}

	public WebElement getLogin() {
		return login;
	}
}
