package com.swaglabs.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	
	protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

	public WebElement findElement(By e) {
		return driver.findElement(e);
	}
	
	public List<WebElement> findElements(By e) {
		return driver.findElements(e);
	}
	
	public void sendKeys(By e, String txt) {
		findElement(e).sendKeys(txt);
	}
	
	public void sendKeys(WebElement e, String txt) {
		e.sendKeys(txt);
	}
	
	public void click(By e) {
		findElement(e).click();
	}
	
	public void click(WebElement e) {
		e.click();
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	
	public String getText(By e) {
		return findElement(e).getText();
	}
	
	public void waitForVisibility(By e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(findElement(e)));
	}

}
