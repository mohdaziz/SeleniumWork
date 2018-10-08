package test;

import PageObjects.Page_Trip_Planner;
import PageObjects.Primary_Navigation_Bar;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Common.Utilities.pickRandomWebElement;
import static Common.Utilities.sleep;
import static org.apache.log4j.Logger.getLogger;

@RunWith(Parameterized.class)
public class DeparturesTest extends BaseTest {

    //WebDriver driver;
    private String fromLocation;
    //private static Logger LOGGER = null;

    public DeparturesTest(String inputLocation) {
        fromLocation = inputLocation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"Epping"}, {"Hornsby"}, {"WestMead"}};
        return Arrays.asList(data);
    }
/*
    @BeforeClass
    public static void setLogger() throws MalformedURLException {
        //System.setProperty("log4j.configurationFile","log4j2-testConfig.xml");
        LOGGER = getLogger("testStep");
    }

    @Before
    public void PreTestCaseRunSetup() {
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //navigate to home page
        driver.get("https://transportnsw.info");

    }
*/
    @Test
    public void planJourneyByDeparture() {

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //sleep(3);

		LOGGER.debug("Navigate to home page");
		driver.get(HOMEPAGE);
		sleep(3);
		
        LOGGER.debug("Select Plan from navigation tool bar");
        Primary_Navigation_Bar.Plan.planContainer(driver).click();
        sleep(3);

        LOGGER.debug("Select departure from the drop down list");
        Primary_Navigation_Bar.Plan.departuresOption(driver).click();
        sleep(3);

        LOGGER.debug("Select Departures sub tab from the left pane");
        Page_Trip_Planner.Departures.tabPaneDepartures(driver).click();

        LOGGER.debug("Search departure destination");
        Page_Trip_Planner.Departures.fromLocation(driver).sendKeys(fromLocation);
        sleep(3);

        //Choose a random destination from result
        LOGGER.debug("Pick a random destination");
        List<WebElement> locationOptions = Page_Trip_Planner.Departures.listSearchResult(driver);
        pickRandomWebElement(locationOptions).click();
        sleep(10);

        LOGGER.debug("Click on Go blue button");
        //Click Go button
        Page_Trip_Planner.Departures.goButton(driver).click();
        sleep(10);

    }
/*
    @After
    public void PostTestCaseRunCleanup() {
        driver.quit();
    }
*/
}
