package Test;

import PageObjects.Primary_Navigation_Bar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Common.Utilities.sleep;


@RunWith(Parameterized.class)
public class RegionalTicketsTest extends BaseTest {

    //WebDriver driver;
    private String fromLocation;
    private String toLocation;
	//private static Logger LOGGER = null; 
	
    public RegionalTicketsTest(String inputFromLocation, String inputToLocation) {
        this.fromLocation = inputFromLocation;
        this.toLocation = inputToLocation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {"Central", "Wagga Wagga"}, {"Central", "NewCastle"}, {"Central", "Katoomba"} };
        return Arrays.asList(data);
    }
/*
    @Before
    public void PreTestCaseRunSetup() {

        driver = new SafariDriver();
        driver.manage().window().setSize(new Dimension(1024, 1440));
        driver.manage().window().setPosition(new Point(1440,100));

    }
*/
    @Test
    public void SearchForRegionalTickets(){

        //navigate to home page
        LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
        sleep(3);

		LOGGER.debug("Click ticket and opal from primary navigation bar");
        Primary_Navigation_Bar.TicketsAndOpal.ticketsAndOpalContainer(driver).click();
        sleep(3);

        //select regional ticket link
        LOGGER.debug("select regional ticket link under ticket and opal drop down list");
		Primary_Navigation_Bar.TicketsAndOpal.regionalTicketsLink(driver).click();
        sleep(15);


		//Flow has changed. Needs rescripting.
		/*
        //select book tab
        driver.findElement(By.id("tridget-book-tab")).click();

        //Search departure
        driver.findElement(By.id("tniFromStop")).sendKeys(fromLocation);
        sleep(3);

        //Choose a departure location from result
        List<WebElement> locationOptions = driver.findElements(By.xpath(".//*[contains(@id,'autosuggest-item-')]"));
        pickRandomWebElement(locationOptions).click();
        sleep(3);

        //Search arrival destination
        driver.findElement(By.id("tniToStop")).sendKeys(toLocation);
        sleep(3);

        //Choose a destination from result
        locationOptions = driver.findElements(By.xpath(".//*[contains(@id,'autosuggest-item-')]"));
        pickRandomWebElement(locationOptions).click();
        sleep(3);

        //plus 1 for passenger
        WebElement passengerCount = driver.findElement(By.id("tniPassengerCount"));
        passengerCount.findElements(By.tagName("button")).get(1).click();
        sleep(1);

        //select a date
        //driver.findElement(By.className("btnpicker btnpickerenabled")).click();
        driver.findElement(By.xpath("//*[@id=\"tniDepartingDate\"]/tni-date-picker/div/div/my-date-picker/div/div/div/button")).click();
        sleep(2);

        //select a date
        //driver.findElements(By.class("daycell currmonth tablesingleday")).get(0).click();
        driver.findElement(By.className("markcurrday")).click();
        sleep(2);

        //Click Search
        driver.findElement(By.xpath("//*[@id=\"booking-content\"]/div[2]/tni-booking/div/div/form/div[2]/button")).click();
        sleep(15);
		*/
    }
/*
    @After
    public void PostTestCaseRunCleanup() {

        driver.quit();

    }
*/

}
