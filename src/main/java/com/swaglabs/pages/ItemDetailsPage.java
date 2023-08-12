package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ItemDetailsPage  extends BasePage{
	
	public ItemDetailsPage(WebDriver driver) {
		super(driver);
	}

	By addToCartButton = By.xpath("//button[contains(text(), 'Add to cart')]");
	By removeFromButton = By.xpath("//button[contains(text(), 'Remove')]");
	By shoppingCartContent = By.className("shopping_cart_badge");
	
	public void click_AddItemToCart() {
		click(addToCartButton);
	}
	
	public void click_RemoveItemFromCart() {
		click(removeFromButton);
	}
	
	public void verify_shoppingCartContents(String itemCount) {
		waitForVisibility(shoppingCartContent);
		Assert.assertEquals(getText(shoppingCartContent), itemCount);
	}
	
	public void verify_emptyCart() {
		if (findElements(shoppingCartContent).size() == 0) {
            System.out.println("Cart Empty"); }
            else {System.out.println("Item not removed");}
        
        }
	
	public void goTo_Cart() {
		click(shoppingCartContent);
	}
	
}
