package Test;

import PageObjects.Page_Regional_Travel_Info;
import PageObjects.Primary_Navigation_Bar;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static Common.Utilities.sleep;

public class TravelInfoOnboardMenuTest extends BaseTest {

	Primary_Navigation_Bar primaryNavBar = PageFactory.initElements(driver, Primary_Navigation_Bar.class);
	Page_Regional_Travel_Info page_RegionalTravelInfo = PageFactory.initElements(driver, Page_Regional_Travel_Info.class);
	
    @Test
    public void SearchTravelOnBoardMenu(){

		LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);
            
		LOGGER.debug("Select travel info from primary navigation bar");
        //Primary_Navigation_Bar.TravelInfo.travelInfoContainer(driver).click();
		primaryNavBar.travelInfoMenu.dropDown.click();
		sleep(3);

		LOGGER.debug("Select onboard menu link");
        //Primary_Navigation_Bar.TravelInfo.RegionalTravel.onBoardMenuLink(driver).click();
		primaryNavBar.travelInfoMenu.onBoardMenuLink.click();
		sleep(3);
			
		LOGGER.debug("Expand hot drinks under regular menu to view");
        //Page_Regional_Travel_Info.RegularMenu.hotDrinksToggleArrow(driver).click();
		page_RegionalTravelInfo.regularMenu.hotDrinksToggleArrow.click();
		sleep(10);

        }

}