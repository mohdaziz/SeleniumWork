package Test;

import PageObjects.Page_Trip_Planner;
import PageObjects.PlanMenu;
import PageObjects.Primary_Navigation_Bar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static Common.Utilities.pickRandomWebElement;
import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class DeparturesTest extends BaseTest {

    private String fromLocation;
	Primary_Navigation_Bar primaryNavBar = PageFactory.initElements(driver, Primary_Navigation_Bar.class);
	Page_Trip_Planner page_TripPlanner = PageFactory.initElements(driver, Page_Trip_Planner.class);
	
    public DeparturesTest(String inputLocation) {
        fromLocation = inputLocation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"Epping"}, {"Hornsby"}, {"WestMead"}};
        return Arrays.asList(data);
    }

    @Test
    public void planJourneyByDeparture() {

		LOGGER.debug("Navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);

        LOGGER.debug("Select plan from navigation tool bar");
        //Primary_Navigation_Bar.Plan.planContainer(driver).click();
        primaryNavBar.planMenu.dropDown.click();
		//primaryNavBar.expandPlanMenu();
        sleep(3);

        LOGGER.debug("Select departure from the drop down list");
        //Primary_Navigation_Bar.Plan.departuresOption(driver).click();
        primaryNavBar.planMenu.departuresLink.click();
		sleep(3);

        LOGGER.debug("Select departures sub tab from the left pane");
        //Page_Trip_Planner.Departures.tabPaneDepartures(driver).click();
		page_TripPlanner.tabPaneDepartures.click();
				
        LOGGER.debug("Search departure destination");
        //Page_Trip_Planner.Departures.fromLocation(driver).sendKeys(fromLocation);
        page_TripPlanner.tab_Departures.fromLocation.sendKeys(fromLocation);
		sleep(3);

        LOGGER.debug("Pick a random destination");
        //List<WebElement> locationOptions = Page_Trip_Planner.Departures.listSearchResult(driver);
        //pickRandomWebElement(locationOptions).click();
		pickRandomWebElement(page_TripPlanner.tab_Departures.listSearchResult).click();
        sleep(10);

        LOGGER.debug("Click on go blue button");
        //Page_Trip_Planner.Departures.goButton(driver).click();
        page_TripPlanner.tab_Departures.goButton.click();
*/		sleep(10);

    }

}
