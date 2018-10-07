package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_Trip_Planner {

    public static WebElement tabPaneTripPlanner(WebDriver driver) {
        return driver.findElement(By.id("tab-pane-tp"));
    }

    public static class Departures {

        public static WebElement tabPaneDepartures(WebDriver driver) {
            return driver.findElement(By.id("tab-pane-nd"));
        }

        public static WebElement fromLocation(WebDriver driver) {
            return driver.findElement(By.id("search-input-NextDep"));
        }

        public static List<WebElement> listSearchResult(WebDriver driver) {
            return driver.findElements(By.xpath(".//*[contains(@id,'suggestion-NextDep-')]"));
        }

        public static WebElement goButton(WebDriver driver) {
            return driver.findElement(By.id("next-dep-search-button"));
        }

     }

}
