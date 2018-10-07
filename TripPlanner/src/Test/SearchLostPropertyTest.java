package test;

import PageObjects.Page_Lost_Property;
import PageObjects.Primary_Navigation_Bar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static Common.Utilities.pickRandomWebElement;
import static Common.Utilities.sleep;

@RunWith(Parameterized.class)
public class SearchLostPropertyTest {

    WebDriver driver;
    private int busRoute;

    public SearchLostPropertyTest(int inputBusRoute) {
        busRoute = inputBusRoute;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {11}, {12}, {13}, {14}, {15} };
        return Arrays.asList(data);
    }

    @Before
    public void PreTestCaseRunSetup() {

        driver = new SafariDriver();

        //resize window
        driver.manage().window().setSize(new Dimension(1024, 1440));

        //home page
        driver.get("https://transportnsw.info");
        sleep(3);

    }

    @Test
    public void SearchForLostProperty() {

        //click contact us
        //driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[5]/a[1]")).click();
        Primary_Navigation_Bar.ContactUs.contactUsContainer(driver).click();
		sleep(3);

        //Click lost property
        //driver.findElement(By.xpath("//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")).click();
        Primary_Navigation_Bar.ContactUs.lostPropertyLink(driver).click();
		sleep(10);

        //expand buses
        //driver.findElement(By.id("accordion-buses-content-header")).click();
        Page_Lost_Property.busesToggleArrow(driver).click();
		sleep(1);

        //search for Route
        //driver.findElement(By.id("search-input-Route")).sendKeys(String.valueOf(busRoute));
        Page_Lost_Property.busRouteTextBox(driver).sendKeys(String.valueOf(busRoute));
		sleep(3);

        //select a bus route
        List<WebElement> busRouteSearchResults = Page_Lost_Property.searchBusRouteResultsList(driver);    //driver.findElements(By.xpath(".//*[contains(@id,'suggestion-Route-')]"));
        pickRandomWebElement(busRouteSearchResults).click();
        sleep(10);

    }

    @After
    public void PostTestCaseRunCleanup() {

        driver.quit();

    }

}
