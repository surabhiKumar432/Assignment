package com.swaglabs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InventoryListPage extends BasePage{

	public InventoryListPage(WebDriver driver) {
		super(driver);
	}

	By inventoryItemList = By.className("inventory_item_name");
	By productsTitle = By.className("title");


	public void select_Item(String itemName) {
		List<WebElement> allItems = driver.findElements(inventoryItemList);
		for (WebElement item : allItems) {
			if (item.getText().equalsIgnoreCase(itemName)) {
				item.click();
				break;
			}
		}
	}
	
	public void verify_ifOnProductsPage() {
		waitForVisibility(productsTitle);
	}




}
