package test;

import PageObjects.Page_Regional_Travel_Info;
import PageObjects.Primary_Navigation_Bar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import static Common.Utilities.sleep;

public class TravelInfoOnboardMenuTest {

        WebDriver driver;

        @Before
        public void PreTestCaseRunSetup() {

			driver = new SafariDriver();

            //resize window
            driver.manage().window().setSize(new Dimension(1024, 1440));
            driver.manage().window().setPosition(new Point(1440,100));

            //navigate to home page
            driver.get("https://transportnsw.info");
        
		}

        @Test
        public void SearchTravelOnBoardMenu(){

            //click travel info from nav bar
            //WebElement primayNavOptions = driver.findElement(By.id("primary-nav"));
            //WebElement travelInfo = driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[4]/a[1]"));
            Primary_Navigation_Bar.TravelInfo.travelInfoContainer(driver).click();
			//travelInfo.click();
            
			sleep(3);

            //select onboard menu
            //WebElement tarvelInfoDropDown = driver.findElement(By.id("/travel-info"));
            //WebElement onBoardMenu = tarvelInfoDropDown.findElement(By.linkText("On board menu"));
            //onBoardMenu.click();
            Primary_Navigation_Bar.TravelInfo.RegionalTravel.onBoardMenuLink(driver).click();
			sleep(3);

            //scroll down 500 pixel
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 800)");
            sleep(1);

            //expand on board menu
            //driver.findElement(By.id("accordion-hot-drinks-content-header")).click();
            Page_Regional_Travel_Info.RegularMenu.hotDrinksToggleArrow(driver).click();
			sleep(10);

        }

        @After
        public void PostTestCaseRunCleanup() {

            driver.quit();

        }

}