package com.connecteminds.expert.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.connectedminds.expert.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Login']")
	WebElement login;
		
	@FindBy(xpath="//a[normalize-space()='Signup']")
	WebElement signup;
	
	@FindBy(xpath="//a[normalize-space()='Forgot Password?']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//img[@alt='connectedminds-logo']")
	WebElement logo;
	
	//Initializing Page Object
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Return page title
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	//Validating the Connectedminds Logo
	public Boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	//Validating registration Functionality
	public RegistrationPage registration() {
		signup.click();
		return new RegistrationPage();
	}
	
	//Validating Forgot Password Page is available
	public ForgotPassword checkForgotPassword() {
		forgotPassword.click();
		return new ForgotPassword();
	}
	
	//Validating the Login Functionality
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
