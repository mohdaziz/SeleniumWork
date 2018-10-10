package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Page_Lost_Property {

	@FindBy(id = "accordion-buses-content-header")
	public WebElement busesToggleArrow;

	@FindBy(id = "search-input-Route")
	public WebElement busRouteTextBox;
	
	@FindBys(
	@FindBy(xpath = ".//*[contains(@id,'suggestion-Route-')]"))
	public List<WebElement> searchBusRouteResultsList;	
/*
    public static WebElement busesToggleArrow(WebDriver driver) {
        return driver.findElement(By.id("accordion-buses-content-header"));
    }
	
    public static WebElement busRouteTextBox(WebDriver driver) {
        return driver.findElement(By.id("search-input-Route"));
    }
	
	public static List<WebElement> searchBusRouteResultsList(WebDriver driver) {
		return driver.findElements(By.xpath(".//*[contains(@id,'suggestion-Route-')]"));
	}
*/
}
