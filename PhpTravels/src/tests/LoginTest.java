package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsLoginPage;
import pages.TitlePage;

public class LoginTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test
	public void basicLogin() throws InterruptedException {

		driver.get(baseUrl);
		Thread.sleep(2000);
		
		TravelsLoginPage tlg = new TravelsLoginPage(driver);
		tlg.signIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
		
		TitlePage tp = new TitlePage(driver);
		
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));
	
		
	}

}
