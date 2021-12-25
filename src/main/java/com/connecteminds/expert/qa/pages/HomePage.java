package com.connecteminds.expert.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.connectedminds.expert.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[normalize-space()='TRENDING']")
	WebElement TrendingLink;

	@FindBy(xpath = "//span[normalize-space()='POSTS']")
	WebElement PostLink;

	@FindBy(xpath = "//span[normalize-space()='COURSES']")
	WebElement CoursesLink;

	@FindBy(xpath = "//span[normalize-space()='PODCASTS']")
	WebElement PodcastLink;

	@FindBy(xpath = "//span[normalize-space()='ARTICLES']")
	WebElement ArticleLink;

	@FindBy(xpath = "//span[normalize-space()='SAVED']")
	WebElement SavedLink;

	// Initializing Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	// Validating Trending Page or Home page is This
	public HomePage CheckTrendingPage() {
		TrendingLink.click();
		return new HomePage();
	}

	// Validating Article Page is available
	public FeedsArticle CheckArticlePage() {
		ArticleLink.click();
		return new FeedsArticle();
	}

	// Validating Post Page is available
	public FeedsPost CheckPostPage() {
		PostLink.click();
		return new FeedsPost();
	}

	// Validating Podcast Page is available
	public FeedsPodcast CheckPodcastPage() {
		PodcastLink.click();
		return new FeedsPodcast();
	}

	// Validating Course Page is available
	public FeedsCourse CheckCoursePage() {
		TrendingLink.click();
		return new FeedsCourse();
	}

	// Validating Saved Page is available
	public FeedsSaved CheckSavedPage() {
		SavedLink.click();
		return new FeedsSaved();
	}

}
