package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_Home {

    public static class Block_TripPlanner {

		public static WebElement tab_Plan(WebDriver driver) {

			return driver.findElement(By.id("tridget-plan-tab"));
			
		}
		
		public static class Tab_Plan {

			public static WebElement subtab_TripPlanner(WebDriver driver) {

				return driver.findElement(By.id("tab-pane-tp"));
			
			}
		
			public static class SubTab_TripPlanner {
				
				public static WebElement fromLocation(WebDriver driver) {
					return driver.findElement(By.id("tniFromTripLocation"));
				
				}
				
				public static WebElement toLocation(WebDriver driver) {
					return driver.findElement(By.id("tniToTripLocation"));
				
				}
				
				public static List<WebElement> autoSuggestList(WebDriver driver) {
					
					return driver.findElements(By.xpath(".//*[contains(@id,'autosuggest-item-')]"));
				
				}
				
				public static WebElement goButton(WebDriver driver) {
					
					return driver.findElement(By.xpath("//*[@id=\"tab-pane-active-content\"]/div/tni-trip-search-form/div/form/div/button[2]"));
				
				}

				public static List<WebElement> tripSearchResultList(WebDriver driver) {
					
					return driver.findElements(By.className("tripResults tp-result-item panel panel-default ng-scope ng-isolate-scope"));
				
				}				
				
			}
		}
		
  		public static class Tab_Alerts {
			
		}
		
	public static class Book {
		
	}
}
