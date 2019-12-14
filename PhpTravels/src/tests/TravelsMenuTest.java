
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsLoginPage;
import pages.TravelsMenu;

public class TravelsMenuTest extends BasicTest {

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
	public void isDashboardSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnDashboard();
		Assert.assertEquals(tp.getPageTitle(), "Dashboard");
	}

	@Test(priority = 5)
	public void isBookingsSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnBookings();
		Assert.assertEquals(tp.getPageTitle(), "Booking Management");
	}

	@Test(priority = 10)
	public void areCouponsSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnCoupons();
		Assert.assertEquals(tp.getPageTitle(), "Coupon Codes Management");
	}

	@Test(priority = 15)
	public void areModulesSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnModules();
		Assert.assertEquals(tp.getPageTitle(), "Modules");
	}

	@Test(priority = 20)
	public void areUpdatesSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnUpdates();
		Assert.assertEquals(tp.getPageTitle(), "Updates");
	}

	@Test(priority = 25)
	public void isNewsletterSelected() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnNewsletter();
		Assert.assertEquals(tp.getPageTitle(), "Newsletter Management");
	}

	@Test(priority = 30)
	public void areToursSelected() throws InterruptedException {

		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnTours();
		Assert.assertTrue(tm.isToursExpanded());

	}

	@Test(priority = 35)
	public void addNewTour() throws InterruptedException {

		TitlePage tp = new TitlePage(driver);
		TravelsMenu tm = new TravelsMenu(driver);

		tm.addNewTour();
		Thread.sleep(2000);
		Assert.assertEquals(tp.getPageTitle(), "Add Tour");
	}

	@Test(priority = 40)
	public void expandCars() throws InterruptedException {

		TravelsMenu tm = new TravelsMenu(driver);

		tm.clickOnCarsMenu();
		Thread.sleep(2000);
		Assert.assertTrue(tm.isCarsExpanded());

	}

}
