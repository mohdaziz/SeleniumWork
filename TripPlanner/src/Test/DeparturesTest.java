package Test;

import PageObjects.Page_Trip_Planner;
import PageObjects.PlanMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class DeparturesTest extends BaseTest {

    private String fromLocation;
	PlanMenu planMenu = PageFactory.initElements(driver, PlanMenu.class);
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
        planMenu.expandDropDown();
		sleep(3);

        LOGGER.debug("Select departure from the drop down list");
        planMenu.clickDeparesLink();
		sleep(3);

        LOGGER.debug("Select departures sub tab from the left pane");
        page_TripPlanner.clickDeparturesTab();
				
        LOGGER.debug("Search departure destination");
        page_TripPlanner.dep_searchNextDeparture(fromLocation);
		sleep(3);

        LOGGER.debug("Pick a random destination");
        page_TripPlanner.dep_selectAutoSuggestion();
        sleep(10);

        LOGGER.debug("Click on go blue button");
        page_TripPlanner.clickDepartureGoButton();
        sleep(10);

    }

}
