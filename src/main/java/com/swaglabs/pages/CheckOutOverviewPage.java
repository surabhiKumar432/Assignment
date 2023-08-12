package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage extends BasePage{
	
	public CheckOutOverviewPage(WebDriver driver) {
		super(driver);
	}

	
	By finish_btn = By.id("finish");
	
	public void click_finishButton() {
		click(finish_btn);
	}

}
