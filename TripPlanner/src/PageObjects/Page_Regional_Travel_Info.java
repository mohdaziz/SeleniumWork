package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Regional_Travel_Info {

    public static class RegularMenu {
	
		public static WebElement hotDrinksToggleArrow(WebDriver driver) {
			return driver.findElement(By.id("accordion-hot-drinks-content-header"));
		}

	}
}
