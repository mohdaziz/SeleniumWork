package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;
import static Common.Utilities.pickRandomWebElement;

public class Page_Trip_Planner {

	private WebDriver driver;
	
	public Page_Trip_Planner(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "tab-pane-tp")
	private WebElement tabPaneTripPlanner;

	@FindBy(id = "tab-pane-nd")
	private WebElement tabPaneDepartures;

	@FindBy(id = "search-input-NextDep")
	private WebElement dep_fromLocation;

	@FindBy(id = "next-dep-search-button")
	private WebElement dep_goButton;

	@FindBys(
		@FindBy(xpath = ".//*[contains(@id,'suggestion-NextDep-')]"))
	private List<WebElement> dep_listSearchResult;

	public void clickDeparturesTab() {
		tabPaneDepartures.click();
	}

	public void dep_searchNextDeparture(String fromLocation) {
		dep_fromLocation.sendKeys(fromLocation);
	}

	public void dep_selectAutoSuggestion() {
		pickRandomWebElement(dep_listSearchResult).click();
	}

	public void clickDepartureGoButton() {
		dep_goButton.click();
	}

}

