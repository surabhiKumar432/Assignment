package com.swaglabs.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.swaglabs.pages.BasePage;
import com.swaglabs.pages.CheckOutOverviewPage;
import com.swaglabs.pages.InventoryListPage;
import com.swaglabs.pages.ItemDetailsPage;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.OrderSuccessPage;
import com.swaglabs.pages.YourCartPage;
import com.swaglabs.pages.YourInfoCheckOutPage;

public class GenericBase{

	public static WebDriver driver = new ChromeDriver();
	protected static BasePage basePage;
	protected static LoginPage loginPage;
	protected static InventoryListPage inventoryPage;
	protected static ItemDetailsPage itemDetailsPage;
	protected static YourCartPage yourCartPage;
	protected static YourInfoCheckOutPage yourInfoPage;
	protected static CheckOutOverviewPage overviewPage;
	protected static OrderSuccessPage orderSuccessPage;
	


	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromeDriver\\chrome.exe");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		basePage = new BasePage(driver);
		loginPage = new LoginPage(driver);
		inventoryPage = new InventoryListPage(driver);
		itemDetailsPage = new ItemDetailsPage(driver);
		yourCartPage = new YourCartPage(driver);
		yourInfoPage = new YourInfoCheckOutPage(driver);
		overviewPage = new CheckOutOverviewPage(driver);
		orderSuccessPage = new OrderSuccessPage(driver);
	}

	@AfterMethod
	public void tearDownMain() {
		driver.close();
		driver.quit();
		
	}

}
