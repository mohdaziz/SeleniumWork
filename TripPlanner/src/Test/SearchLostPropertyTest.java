package Test;

import PageObjects.Page_Lost_Property;
import PageObjects.ContactUsMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;

import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class SearchLostPropertyTest extends BaseTest {

    private int busRoute;
	ContactUsMenu contactUsMenu = PageFactory.initElements(driver, ContactUsMenu.class);
	Page_Lost_Property pageLostProperty = PageFactory.initElements(driver, Page_Lost_Property.class);
	
    public SearchLostPropertyTest(int inputBusRoute) {
        busRoute = inputBusRoute;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {11}, {12}, {13}, {14}, {15} };
        return Arrays.asList(data);
    }

    @Test
    public void SearchForLostProperty() {

		LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);
	
        LOGGER.debug("Click on contact us link from primary navigation bar");
		contactUsMenu.expandDropDown();
		sleep(3);

        LOGGER.debug("Select lost property link from Contact Us drop down list");
		contactUsMenu.clickLostPropertyLink();
		sleep(10);

        LOGGER.debug("expand buses under operator contacts list");
		pageLostProperty.clickBusesDropDownArrow();
		sleep(1);

        LOGGER.debug("Search by route id");
		pageLostProperty.searchBusRoute(busRoute);
		sleep(3);

		LOGGER.debug("randomly select a bus route from search result");
        //pickRandomWebElement(pageLostProperty.searchBusRouteResultsList).click();
        pageLostProperty.selectBusRouteFromSearchResult();
		sleep(10);

    }

}
