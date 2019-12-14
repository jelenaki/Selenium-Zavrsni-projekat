package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsCustomer;
import pages.TravelsLoginPage;

public class TravelsCustomerTest extends BasicTest {

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
	public void updateCustomerTest() throws InterruptedException {
		TravelsCustomer tc = new TravelsCustomer(driver);
		tc.goToCustomerMenagementPage();
		Thread.sleep(2000);
		tc.clickOnEditBtn();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		tc.setFirstName("Marko");
		Thread.sleep(2000);
		tc.setLastName("Markovic");
		Thread.sleep(2000);
		tc.setEmail("marko@gmail.com");
		tc.setMobileNumber("5585599");
		Thread.sleep(2000);
		tc.setCountry("France");
		Thread.sleep(2000);
		tc.inputAddress1("Blvd Blvd");
		Thread.sleep(2000);
		tc.selectStatusEnabled();
		Thread.sleep(2000);
		tc.selectCheckboxEmailSubscriber();
		tc.clickOnSubmitBtn();
		Thread.sleep(2000);

		tc.clickSearch();
		Thread.sleep(3000);
		tc.setSearchInput("Marko");
		Thread.sleep(3000);
		tc.clickGo();
		Assert.assertFalse(tc.getCustomer().getText().contains("Marko"));

	}

}
