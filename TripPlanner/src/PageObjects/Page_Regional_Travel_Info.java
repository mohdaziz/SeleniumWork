package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Regional_Travel_Info {

	private WebDriver driver;
	
	public Page_Regional_Travel_Info(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "accordion-hot-drinks-content-header")
	private WebElement hotDrinksToggleArrow;

	public void viewHotDrinksMenu() {
		hotDrinksToggleArrow.click();
	}

}

