package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCustomer extends BasicPage {

	private By accounts = By.cssSelector("[href='#ACCOUNTS']");
	private By customers = By.cssSelector("[href='https://www.phptravels.net/admin/accounts/customers/']");
	private By editBtn = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[8]/span/a[1]");
	private By firstName = By.name("fname");
	private By lastName = By.name("lname");
	private By email = By.name("email");
	private By mobileNumber = By.name("mobile");
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By countryInput = By.className("select2-input");
	private By address1 = By.name("address1");
	private By statusEnabled = By
			.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[11]/div/div/div/select/option[1]");
	private By emailSubscriber = By.name("newssub");
	private By submitBtn = By.cssSelector("button.btn-primary");
	private By search = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a");
	private By putName = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	private By customer = By.cssSelector("tr.xcrud-row");

	public TravelsCustomer(WebDriver driver) {
		super(driver);
	}

	public WebElement getAccounts() {
		return this.driver.findElement(accounts);
	}

	public void clickOnAccounts() {
		this.getAccounts().click();
	}

	public WebElement getCustomers() {
		return this.driver.findElement(customers);
	}

	public void clickOnCustomers() {
		this.getCustomers().click();
	}

	public void goToCustomerMenagementPage() throws InterruptedException {
		this.clickOnAccounts();
		Thread.sleep(2000);
		this.clickOnCustomers();
	}

	public WebElement getEditBtn() {
		return this.driver.findElement(editBtn);
	}

	public void clickOnEditBtn() {
		this.getEditBtn().click();
	}

	public WebElement getFirstName() {
		return this.driver.findElement(firstName);
	}

	public void clearFirstName() {
		this.getFirstName().clear();
	}

	public void inputFirstName(String firstName) {
		this.getFirstName().sendKeys(firstName);
	}

	public void setFirstName(String firstName) throws InterruptedException {
		this.clearFirstName();
		Thread.sleep(2000);
		this.inputFirstName(firstName);

	}

	public WebElement getLastName() {
		return this.driver.findElement(lastName);
	}

	public void clearLastName() {
		this.getLastName().clear();
	}

	public void inputLastName(String lastName) {
		this.getLastName().sendKeys(lastName);
	}

	public void setLastName(String lastName) throws InterruptedException {
		this.clearLastName();
		Thread.sleep(2000);
		this.inputLastName(lastName);

	}

	public WebElement getEmail() {
		return this.driver.findElement(email);
	}

	public void clearEmail() {
		this.getEmail().clear();
	}

	public void inputEmail(String email) {
		this.getEmail().sendKeys(email);
	}

	public void setEmail(String email) throws InterruptedException {
		this.clearEmail();
		Thread.sleep(2000);
		this.inputEmail(email);

	}

	public WebElement getMobileNumber() {
		return this.driver.findElement(mobileNumber);
	}

	public void clearMobileNumber() {
		this.getMobileNumber().clear();
	}

	public void inputMobileNumber(String mobileNumber) {
		this.getMobileNumber().sendKeys(mobileNumber);
	}

	public void setMobileNumber(String mobileNumber) throws InterruptedException {
		this.clearMobileNumber();
		Thread.sleep(2000);
		this.inputMobileNumber(mobileNumber);

	}

	public void setCountry(String countryName) {
		this.driver.findElement(this.country).click();
		WebElement country = driver.findElement(this.countryInput);
		country.sendKeys(countryName);
		country.sendKeys(Keys.ENTER);
	}

	public WebElement getAddress1() {
		return this.driver.findElement(address1);
	}

	public void inputAddress1(String address) {
		this.getAddress1().sendKeys(address);
	}

	public WebElement getStatusEnabled() {
		return this.driver.findElement(statusEnabled);
	}

	public void selectStatusEnabled() {
		this.getStatusEnabled().click();
	}

	public WebElement getEmailSubscriberCheckbox() {
		return this.driver.findElement(emailSubscriber);
	}

	public void selectCheckboxEmailSubscriber() {
		this.getEmailSubscriberCheckbox().click();
	}

	public WebElement getSubmitBtn() {
		return this.driver.findElement(submitBtn);
	}

	public void clickOnSubmitBtn() {
		this.getSubmitBtn().click();
	}
	
	public void clickSearch() {
		this.driver.findElement(this.search).click();
	}
	public void setSearchInput(String name) {
		this.driver.findElement(this.putName).sendKeys(name);		
	}
	public void clickGo() {
		this.driver.findElement(this.go).click();
	}
	public WebElement getCustomer() {
		return this.driver.findElement(this.customer);
	}


}
