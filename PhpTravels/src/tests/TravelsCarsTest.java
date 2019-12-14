package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TravelsCars;
import pages.TravelsLoginPage;
import pages.TravelsMenu;

public class TravelsCarsTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@BeforeTest
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLoginPage tlg = new TravelsLoginPage(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);

	}

	@Test
	public void numberOfRentedCars() throws InterruptedException {

		TravelsMenu tm = new TravelsMenu(driver);
		tm.clickOnCars();
		Thread.sleep(2000);
		TravelsCars tcp = new TravelsCars(driver);

		Assert.assertTrue(tcp.isNumberOfOrderedCarsMoreThen50());

		Assert.assertFalse(tcp.isNumberOfRentedCars10());

	}

}
