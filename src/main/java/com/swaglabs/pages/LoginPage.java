package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By errorText = By.className("error-button");
	By username_et = By.id("user-name");
	By password_et = By.id("password");
	By login_btn = By.id("login-button");
	
	public void enter_username(String name) {
		sendKeys(username_et,name);
	}
	
	public void enter_password(String pwd) {
		sendKeys(password_et,pwd);
	}
	
	public void click_LoginButton() {
		click(login_btn);
	}
	
	public void verifyErrorMsg() {
		waitForVisibility(errorText);
	}
	

}
