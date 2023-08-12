package functionalities;

import org.testng.annotations.Test;

import com.swaglabs.base.GenericBase;

public class AddToCart extends GenericBase{
	
	@Test
	public void addToCart(){
		
		/** Login with valid credentials **/
		new LoginUser().login("standard_user", "secret_sauce");
		
		/**Select the required item 
		 * Click on 'Add To Cart' 
		 * Verify the shopping cart content count 
		 */
		inventoryPage.select_Item("Sauce Labs Bike Light");
		itemDetailsPage.click_AddItemToCart();
		itemDetailsPage.verify_shoppingCartContents("1");
	}

}
