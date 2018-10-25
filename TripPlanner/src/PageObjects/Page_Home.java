package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static Common.Utilities.pickRandomWebElement;

public class Page_Home {

	private WebDriver driver;

	public Page_Home(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "tridget-plan-tab")
	private WebElement tab_Plan;

	@FindBy(id = "tniFromTripLocation")
	private WebElement tp_TripPlanner;

	@FindBy(id = "tniFromTripLocation")
	private WebElement tp_FromLocation;

	@FindBy(id = "tniToTripLocation")
	private WebElement tp_ToLocation;

	@FindBys(
	    @FindBy(xpath = ".//*[contains(@id,'autosuggest-item-')]"))
    private List<WebElement> searchAutoSuggestList;

	@FindBy(xpath = "//*[@id=\"tab-pane-active-content\"]/div/tni-trip-search-form/div/form/div/button[2]")
    private WebElement tp_GoButton;

	@FindBys(
    	@FindBy(className = "tripResults tp-result-item panel panel-default ng-scope ng-isolate-scope"))
    private List<WebElement> tp_tripSearchResultsList;

    public void selectTabPlan() {
        tab_Plan.click();
    }

    public void tp_SelectTabTripPlanner(){
        tp_TripPlanner.click();
    }

    public void tp_EnterFromLocation(String fromLocation) {
        tp_FromLocation.sendKeys(fromLocation);
    }

    public void tp_RandomSelectLocationFromAutoSuggestList() {
        pickRandomWebElement(searchAutoSuggestList).click();
    }

    public void tp_ClickGoButton() {
        tp_GoButton.click();
    }

}