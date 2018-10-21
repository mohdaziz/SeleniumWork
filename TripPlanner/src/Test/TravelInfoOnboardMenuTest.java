package Test;

import PageObjects.Page_Regional_Travel_Info;
import PageObjects.TravelInfoMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static Common.Utilities.sleep;

public class TravelInfoOnboardMenuTest extends BaseTest {

	Page_Regional_Travel_Info page_RegionalTravelInfo = PageFactory.initElements(driver, Page_Regional_Travel_Info.class);
	TravelInfoMenu travelInfoMenu = PageFactory.initElements(driver, TravelInfoMenu.class);
	
    @Test
    public void SearchTravelOnBoardMenu(){

		LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);

		LOGGER.debug("Select travel info from primary navigation bar");
        //Primary_Navigation_Bar.TravelInfo.travelInfoContainer(driver).click();
		travelInfoMenu.expandDropDown();
		sleep(3);

		LOGGER.debug("Select onboard menu link");
        //Primary_Navigation_Bar.TravelInfo.RegionalTravel.onBoardMenuLink(driver).click();
		travelInfoMenu.clickOnBoardMenuLink();
		sleep(3);
			
		LOGGER.debug("Expand hot drinks under regular menu to view");
        //Page_Regional_Travel_Info.RegularMenu.hotDrinksToggleArrow(driver).click();
		page_RegionalTravelInfo.viewHotDrinksMenu();
		sleep(10);

        }

}