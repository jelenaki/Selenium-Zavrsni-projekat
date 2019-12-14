package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsCarsExtras;
import pages.TravelsLoginPage;
import pages.TravelsMenu;

public class TravelsCarsExtrasTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@BeforeTest
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLoginPage tlg = new TravelsLoginPage(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public void areAddExtrasAddes() throws InterruptedException {

		TravelsMenu tm = new TravelsMenu(driver);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);

		tm.clickOnCarsExtras();
		Thread.sleep(2000);
		tce.clickOnAddExtrasBtn();
		Thread.sleep(2000);
		tce.uploadImage("Slike\\01 (1).jpg");
		Thread.sleep(3000);
		tce.setName("Seat");
		Thread.sleep(2000);
		tce.setStatus("No");
		tce.setPrice("85");
		Thread.sleep(2000);
		
		tce.clickOnSaveAndreturnBtn();
		Thread.sleep(5000);
		
		Assert.assertTrue(tce.carsExtrasAdded("Seat"));

	}

}
