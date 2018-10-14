package Test;

import PageObjects.Page_Home;
import PageObjects.Primary_Navigation_Bar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static Common.Utilities.pickRandomWebElement;
import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class TripPlannerTest extends BaseTest{

    private String fromLocation;
    private String toLocation;
	Primary_Navigation_Bar primaryNavBar = PageFactory.initElements(driver, Primary_Navigation_Bar.class);

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
		//Page_Home.Block_TripPlanner.tab_Plan(driver).click();
		primaryNavBar.homeMenu.homeMenuLink.click();
		sleep(1);
		
		LOGGER.debug("Select trip planner sub tab");
        //select trip planer tab from Plan container
        //driver.findElement(By.id("tab-pane-tp")).click();
		Page_Home.Block_TripPlanner.Tab_Plan.subtab_TripPlanner(driver).click();
		sleep(1);
		
		LOGGER.debug("search for origin destination");
        //enter origin location for search
        //driver.findElement(By.id("tniFromTripLocation")).sendKeys(fromLocation);
        Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.fromLocation(driver).sendKeys(fromLocation);
		sleep(3);

		LOGGER.debug("randomly select origin from search result");
        //randomly select origin from search results
        List<WebElement> locationOptions = Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.autoSuggestList(driver);//driver.findElements(By.xpath(".//*[contains(@id,'autosuggest-item-')]")); //By.id("autosuggest-item-\\d)"));
        pickRandomWebElement(locationOptions).click();
        sleep(3);

		LOGGER.debug("search for arrival destination");
        //search arrival destination
        //driver.findElement(By.id("tniToTripLocation")).sendKeys(toLocation);
        Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.toLocation(driver).sendKeys(toLocation);
		sleep(3);

		LOGGER.debug("randomly select arrival from search result");
        //randomly select arrival destination
        locationOptions = Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.autoSuggestList(driver); //driver.findElements(By.xpath(".//*[contains(@id,'autosuggest-item-')]"));
        pickRandomWebElement(locationOptions).click();
        sleep(5);
	
		LOGGER.debug("Click GO");
        //click GO
        //driver.findElement(By.xpath("//*[@id=\"tab-pane-active-content\"]/div/tni-trip-search-form/div/form/div/button[2]")).click();
        Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.goButton(driver).click();
		sleep(5);

        //Check the number of route results
        int routeOptions = Page_Home.Block_TripPlanner.Tab_Plan.SubTab_TripPlanner.tripSearchResultList(driver).size(); //driver.findElements(By.className("tripResults tp-result-item panel panel-default ng-scope ng-isolate-scope")).size();
        System.out.println("The number of search results is :" + routeOptions);
        sleep(5);

    }
}
