package Test;

import PageObjects.TicketAndOpalMenu;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;

import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class RegionalTicketsTest extends BaseTest {

    private String fromLocation;
    private String toLocation;
	private TicketAndOpalMenu ticketsAndOpalMenu = PageFactory.initElements(driver, TicketAndOpalMenu.class);
	
    public RegionalTicketsTest(String inputFromLocation, String inputToLocation) {
        this.fromLocation = inputFromLocation;
        this.toLocation = inputToLocation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {"Central", "Wagga Wagga"}, {"Central", "NewCastle"}, {"Central", "Katoomba"} };
        return Arrays.asList(data);
    }

    @Test
    public void SearchForRegionalTickets(){

        LOGGER.debug("navigate to home page");
		driver.get(HOMEPAGE);
        sleep(3);

		LOGGER.debug("Click ticket and opal from primary navigation bar");
        ticketsAndOpalMenu.expandDropDown();
		sleep(3);

        LOGGER.debug("select regional ticket link under ticket and opal drop down list");
        ticketsAndOpalMenu.clickRegionalTicketsLink();
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

}
