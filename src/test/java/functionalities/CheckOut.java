package functionalities;

import org.testng.annotations.Test;

import com.swaglabs.base.GenericBase;

public class CheckOut extends GenericBase{
	
	@Test
	public void checkOut(){
		
		/** Login with valid credentials 
		 * Select the required item 
		 * Click on 'Add To Cart' 
		 * Verify the shopping cart content count
		 **/
		new AddToCart().addToCart();
		
		
		itemDetailsPage.goTo_Cart(); // Go to the cart
		yourCartPage.proceedTo_CheckOut(); // Click on Checkout
		// Enter user Details - Click Continue button
		yourInfoPage.enter_firstName("Kunti");
		yourInfoPage.enter_lastName("Pandu");
		yourInfoPage.enter_zipCode("6780");
		yourInfoPage.click_Continue();
		overviewPage.click_finishButton(); // Overview page click on continue
		orderSuccessPage.assertSuccessMsg(); // Validate the success message shown
	}
}
