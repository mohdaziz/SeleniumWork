package Test;

import PageObjects.Page_Home;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class TripPlannerTest extends BaseTest{

    private String fromLocation;
    private String toLocation;
	private Page_Home pageHome = PageFactory.initElements(driver, Page_Home.class);

    public TripPlannerTest(String fromInput, String toInput){
        fromLocation = fromInput;
        toLocation = toInput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {"Parramatta", "Central"}, {"Redfern", "Blacktown"}, {"Strathfield", "Lidcombe" } };
        return Arrays.asList(data);
    }

    @Test
    public void SearchTripByArrivalAndDestination(){

		LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);

		LOGGER.debug("Select Plan tab from left sub window");
		pageHome.selectTabPlan();
        sleep(1);
		
		LOGGER.debug("Select trip planner sub tab");
        pageHome.tp_SelectTabTripPlanner();
        sleep(1);
		
		LOGGER.debug("search for origin destination");
		pageHome.tp_EnterFromLocation(fromLocation);
        sleep(3);

		LOGGER.debug("randomly select origin from search result");
        pageHome.tp_RandomSelectLocationFromAutoSuggestList();
        sleep(3);

		LOGGER.debug("search for arrival destination");
        pageHome.tp_EnterToLocation(toLocation);
        sleep(3);

		LOGGER.debug("randomly select arrival from search result");
        pageHome.tp_RandomSelectLocationFromAutoSuggestList();
        sleep(5);
	
		LOGGER.debug("Click GO");
		pageHome.tp_ClickGoButton();
        sleep(10);

        //Check the number of route results
        int routeOptions = pageHome.tp_getTripSearchResultsCount();
        System.out.println("The number of search results is :" + routeOptions);
        sleep(5);

    }
}
