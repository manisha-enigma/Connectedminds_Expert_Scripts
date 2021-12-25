package com.connectedminds.expert.qa.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.connectedminds.expert.qa.base.TestBase;
import com.connecteminds.expert.qa.pages.HomePage;
import com.connecteminds.expert.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage =  new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, prop.getProperty("LoginTitle"));
	}
	
	@Test
	public void logoAvailableTest() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest() throws Exception {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
