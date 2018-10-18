package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;
import static Common.Utilities.pickRandomWebElement;

public class Page_Lost_Property {

	private WebDriver driver;
	
	public Page_Lost_Property(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "accordion-buses-content-header")
	private WebElement busesToggleArrow;
	
	@FindBy(id = "search-input-Route")
	private WebElement busRouteTextBox;
	
	@FindBys(
	@FindBy(xpath = ".//*[contains(@id,'suggestion-Route-')]"))
	private List<WebElement> searchRouteResultsList;	

	public void clickBusesDropDownArrow() {
		busesToggleArrow.click();
	}
	
	public void searchBusRoute(int busRouteNo) {
		busRouteTextBox.sendKeys(String.valueOf(busRouteNo));
	}
	
	public void selectBusRouteFromSearchResult() {
		pickRandomWebElement(searchRouteResultsList).click();
	}
	
}
