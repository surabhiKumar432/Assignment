package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderSuccessPage extends BasePage{
	
	public OrderSuccessPage(WebDriver driver) {
		super(driver);
	}

	
	By successText = By.className("complete-header");
	
	public void assertSuccessMsg() {
		waitForVisibility(successText);
		Assert.assertEquals(true, getText(successText).contentEquals("Thank you for your order!"));
	}

}
