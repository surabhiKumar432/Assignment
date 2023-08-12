package functionalities;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swaglabs.base.GenericBase;
import com.swaglabs.pages.InventoryListPage;


public class LoginUser extends GenericBase{


	@Test
	public void login() {

		/** Provide a set of valid or invalid credentials **/
		String username = "standard_user";
		String password = "secret_sauce";
		
		/** Enter the user-name and password **/
		loginPage.enter_username(username);
		loginPage.enter_password(password);
		/** Click the login button **/
		loginPage.click_LoginButton();

		/** Validate whether the login was successful or not **/
		String loginPageUrl = loginPage.getUrl();

		if (!password.equals("secret_sauce")) {
			loginPage.verifyErrorMsg(); // Error message shown if the password is other than 'secret_sauce'
			System.out.println("Login failed.");
		} else {
			//If password is 'secret_sauce', verify whether the user is taken to the next page
			assertEquals(false, !loginPage.getUrl().contentEquals(loginPageUrl));
			System.out.println("Login Successful.");
			inventoryPage.verify_ifOnProductsPage();
		}

	}
	
	public void login(String username,String password) {
		loginPage.enter_username(username);
		loginPage.enter_password(password);
		loginPage.click_LoginButton();

		String loginPageUrl = loginPage.getUrl();

		if (!password.equals("secret_sauce")) {
			loginPage.verifyErrorMsg();
			System.out.println("Login failed.");
		} else {
			assertEquals(false, !loginPage.getUrl().contentEquals(loginPageUrl));
			System.out.println("Login Successful.");
		}

	}

}
