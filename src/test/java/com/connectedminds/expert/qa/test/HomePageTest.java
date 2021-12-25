package com.connectedminds.expert.qa.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.connectedminds.expert.qa.base.TestBase;
import com.connecteminds.expert.qa.pages.HomePage;
import com.connecteminds.expert.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void checkTrendingPageTest() {
		homePage.CheckTrendingPage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("TrendingUrl"));
	}

	@Test
	public void checkCoursesPageTest() {
		homePage.CheckCoursePage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("CourseUrl"));
	}

	@Test
	public void checkPostPageTest() {
		homePage.CheckPostPage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("PostUrl"));
	}

	@Test
	public void checkPodcastPageTest() {
		homePage.CheckPodcastPage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("PodcastUrl"));
	}

	@Test
	public void checkArticleTest() {
		homePage.CheckArticlePage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("ArticleUrl"));
	}

	@Test
	public void checkSavedPageTest() {
		homePage.CheckSavedPage();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, prop.getProperty("SavedUrl"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
