package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage {

	private By dashboard = By.cssSelector("[href='https://www.phptravels.net/admin']");
	private By updates = By.cssSelector("[href='https://www.phptravels.net/admin/updates/']");
	private By modules = By.cssSelector("[href='https://www.phptravels.net/admin/settings/modules/']");
	private By tours = By.cssSelector("[href='#Tours']");
	private By coupons = By.cssSelector("[href='https://www.phptravels.net/admin/coupons/']");
	private By newsletter = By.cssSelector("[href='https://www.phptravels.net/admin/newsletter/']");
	private By bookings = By.cssSelector("[href='https://www.phptravels.net/admin/bookings/']");
	private By addNewTour = By.cssSelector("[href='https://www.phptravels.net/admin/tours/add']");
	private By carsMenu = By.cssSelector("[href='#Cars']");
	private By cars = By.cssSelector("a[href='https://www.phptravels.net/admin/cars']");
	private By carsExtras = By.cssSelector("[href='https://www.phptravels.net/admin/cars/extras']");


	public TravelsMenu(WebDriver driver) {
		super(driver);

	}

	public WebElement getDashboard() {
		return this.driver.findElement(dashboard);
	}

	public void clickOnDashboard() {
		this.getDashboard().click();
	}

	public WebElement getUpdates() {
		return this.driver.findElement(updates);
	}

	public void clickOnUpdates() {
		this.getUpdates().click();
	}

	public WebElement getModules() {
		return this.driver.findElement(modules);
	}

	public void clickOnModules() {
		this.getModules().click();
	}

	public WebElement getTours() {
		return this.driver.findElement(tours);
	}

	public void clickOnTours() {
		this.getTours().click();
	}

	public WebElement getCoupons() {
		return this.driver.findElement(coupons);
	}

	public void clickOnCoupons() {
		this.getCoupons().click();
	}

	public WebElement getNewsletter() {
		return this.driver.findElement(newsletter);
	}

	public void clickOnNewsletter() {
		this.getNewsletter().click();
	}

	public WebElement getBookings() {
		return this.driver.findElement(bookings);
	}

	public void clickOnBookings() {
		this.getBookings().click();
	}

	public WebElement getNewTour() {
		return this.driver.findElement(addNewTour);
	}

	public void addNewTour() {
		//mozda treba click
		this.getNewTour().click();

	}

	public WebElement getCarsMenu() {
		return this.driver.findElement(carsMenu);
	}

	public void clickOnCarsMenu() {
		this.getCarsMenu().click();
	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public void clickOnCars() {
		this.clickOnCarsMenu();
		this.getCars().click();
	}

	public WebElement getCarsExtras() {
		return this.driver.findElement(carsExtras);
	}

	public void clickOnCarsExtras() throws InterruptedException {
		this.clickOnCarsMenu();
		Thread.sleep(2000);
		this.getCarsExtras().click();

	}

	public boolean isToursExpanded() {
		boolean toursExpanded = false;
		if (driver.findElement(this.addNewTour).isDisplayed()) {
			toursExpanded = true;
		}
		return toursExpanded;

	}
	
	public boolean isCarsExpanded() {
		boolean carsExpanded = false;
		if (driver.findElement(this.carsExtras).isDisplayed()) {
			carsExpanded = true;
		}
		return carsExpanded;

	}

}
