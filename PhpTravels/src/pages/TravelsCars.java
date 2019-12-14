package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {

	private By cars = By.cssSelector(".xcrud-list-container table.xcrud-list.table .xcrud-row");
	private By carsOrders = By.cssSelector(".xcrud-list.table tbody .xcrud-row td [data-url='https://www.phptravels.net/cars/carajaxcalls/update_car_order']");
	
	
	public TravelsCars(WebDriver driver) 
		{
		super(driver);
		}

	public boolean isNumberOfRentedCars10() {
		boolean NumberOfCars10 = false;
		List<WebElement> carsList = driver.findElements(this.cars);
		int counter = 0;
		for (int i = 0; i < carsList.size(); i++) {
			counter++;
		}
		System.out.println("Number of rented cars is: " + counter);

		if (counter == 10) {
			NumberOfCars10 = true;
		}
		return NumberOfCars10;

	}

	public boolean isNumberOfOrderedCarsMoreThen50() {
		boolean NumberOfCars50 = true;
		int sum = 0;
		List<WebElement> orderList = driver.findElements(this.carsOrders);
		for (int i = 0; i < orderList.size(); i++) {
			String str = orderList.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sum += number;
		}
		System.out.println("Total number of orders is: " + sum);
		if (sum < 50) {
			NumberOfCars50 = false;
		}
		return NumberOfCars50;
	}

}
