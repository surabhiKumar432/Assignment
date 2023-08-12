package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInfoCheckOutPage extends BasePage{
	
	public YourInfoCheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	By firstname_et = By.id("first-name");
	By lastName_et = By.id("last-name");
	By zipCode_et = By.id("postal-code");
	By continue_btn = By.id("continue");
	
	public void enter_firstName(String name) {
		sendKeys(firstname_et,name);
	}
	
	public void enter_lastName(String name) {
		sendKeys(lastName_et,name);
	}
	
	public void enter_zipCode(String postalCode) {
		sendKeys(zipCode_et,postalCode);
	}
	
	public void click_Continue() {
		click(continue_btn);
	}

}
