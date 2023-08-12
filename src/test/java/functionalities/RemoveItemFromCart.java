package functionalities;

import org.testng.annotations.Test;

import com.swaglabs.base.GenericBase;

public class RemoveItemFromCart extends GenericBase{
	
	@Test
	public void removeItemFromCart(){
		
		/** Login with valid credentials 
		 * Select the required item 
		 * Click on 'Add To Cart' 
		 * Verify the shopping cart content count
		 **/
		new AddToCart().addToCart();
		itemDetailsPage.click_RemoveItemFromCart(); // Click on Remove button
		itemDetailsPage.verify_emptyCart(); // Verify the empty cart contents
		
		
	}
	
	

}
