package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage{
	
	public YourCartPage(WebDriver driver) {
		super(driver);
	}
	
	By checkOutButton = By.id("checkout");
	
	public void proceedTo_CheckOut() {
		click(checkOutButton);
	}
	
}
