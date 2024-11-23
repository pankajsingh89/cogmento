package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page factory - OR;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginBtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public void login(String uname, String pass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();

	}
}
