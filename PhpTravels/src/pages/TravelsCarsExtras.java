package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {

	private By addExtrasBtn = By.cssSelector("a.btn-success.xcrud-action.btn[data-task='create'][href='javascript:;']");
	private By addImageInput = By.name("xcrud-attach");
	private By nameInput = By.cssSelector("[name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--']");
	private By status = By.cssSelector("select.xcrud-input.form-control");
	private By priceInput = By.cssSelector("[name='cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--']");
	private By saveAndReturnBtn = By.cssSelector("a.btn.xcrud-action.btn-primary");

	public TravelsCarsExtras(WebDriver driver) {
		super(driver);

	}

	public WebElement getAddExtrasBtn() {
		return this.driver.findElement(addExtrasBtn);
	}

	public void clickOnAddExtrasBtn() {
		this.getAddExtrasBtn().click();
	}

	public WebElement getUploadInput() {
		return this.driver.findElement(addImageInput);
	}

	public void uploadImage(String path) {
		getUploadInput().sendKeys(new File(path).getAbsolutePath());
	}

	public void setName(String nameInput) {
		this.driver.findElement(this.nameInput).sendKeys(nameInput);
	}

	public WebElement getStatus() {
		return this.driver.findElement(status);
	}

	public void setStatus(String input) {
		WebElement selectStatus = this.getStatus();
		Select extrasStatus = new Select(selectStatus);
		extrasStatus.selectByVisibleText(input);

	}

	public void setPrice(String priceInput) {
		this.driver.findElement(this.priceInput).sendKeys(priceInput);
	}

	public WebElement getSaveAndReturnBtn() {
		return this.driver.findElement(saveAndReturnBtn);
	}

	public void clickOnSaveAndreturnBtn() {
		this.getSaveAndReturnBtn().click();
	}

	public boolean carsExtrasAdded(String nameInput) {

		return this.driver.findElement(By.xpath("//td[contains(text(),'" + nameInput + "')]")) != null;
	}

}
