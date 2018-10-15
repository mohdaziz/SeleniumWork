package PageObjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;

public class Page_Trip_Planner {

	private WebDriver driver;
	
	public Page_Trip_Planner(WebDriver driver) {
		this.driver = driver;
	}

	public Tab_Departures tab_Departures = PageFactory.initElements(driver, Tab_Departures.class);
	public Tab_Trip_Planner tab_TripPlanner = PageFactory.initElements(driver, Tab_Trip_Planner.class);
	
	@FindBy(id = "tab-pane-tp")
	public WebElement tabPaneTripPlanner;

	@FindBy(id = "tab-pane-nd")
	public WebElement tabPaneDepartures;

	public class Tab_Departures {

		@FindBy(id = "search-input-NextDep")
		public WebElement fromLocation;

		@FindBy(id = "next-dep-search-button")
		public WebElement goButton;

		@FindBys(
				@FindBy(xpath = ".//*[contains(@id,'suggestion-NextDep-')]"))
		public List<WebElement> listSearchResult;

	}

	public class Tab_Trip_Planner {

		/* implementation in progress */

	}
	
}
