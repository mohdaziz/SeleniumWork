package Test;

import PageObjects.Page_Lost_Property;
import PageObjects.Primary_Navigation_Bar;
import PageObjects.ContactUsMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class SearchLostPropertyTest extends BaseTest {

    private int busRoute;
	//Primary_Navigation_Bar primaryNavBar = PageFactory.initElements(driver, Primary_Navigation_Bar.class);
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

		LOGGER.debug("randonly select a bus route from search result");
        //pickRandomWebElement(pageLostProperty.searchBusRouteResultsList).click();
        contactUsMenu.selectBusRouteFromSearchResult();
		sleep(10);

    }

}
