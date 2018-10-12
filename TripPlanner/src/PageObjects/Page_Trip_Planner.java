package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;

public class Page_Trip_Planner {

	@FindBy(id = "tab-pane-tp")
	public WebElement tabPaneTripPlanner;

	@FindBy(id = "tab-pane-nd")
	public WebElement tabPaneDepartures;
	
	public Tab_Departures tab_Departures = new Tab_Departures();

	private class Tab_Departures {

		@FindBy(id = "search-input-NextDep")
		private WebElement fromLocation;

		@FindBy(id = "next-dep-search-button")
		private WebElement goButton;

		@FindBys(
				@FindBy(xpath = ".//*[contains(@id,'suggestion-NextDep-')]"))
		private List<WebElement> listSearchResult;

	}

	private class Tab_Trip_Planner {

		/* implementation in progress */

	}
	
}
