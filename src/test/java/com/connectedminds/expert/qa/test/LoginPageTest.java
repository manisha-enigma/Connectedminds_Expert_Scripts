package com.connectedminds.expert.qa.test;

import org.openqa.selenium.By;
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
		homePage = loginPage.loginPositive(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void loginNegativeTest() throws Exception {
		homePage = loginPage.loginNegative(prop.getProperty("invalidUsername"), prop.getProperty("password"));
		String act = driver.findElement(By.id("notistack-snackbar")).getText();
		String exp = "No user data found to login, please check your provided details.";
		Assert.assertEquals(act, exp);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
