package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		intialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Test(priority = 2)
	public void enterUserPassword() {
		String uName = prop.getProperty("username");
		String pass = prop.getProperty("password");
		loginPage.login(uName, pass);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
