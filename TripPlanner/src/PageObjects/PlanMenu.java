package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class PlanMenu {

	private WebDriver driver;
	
	public PlanMenu(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
	private WebElement dropDown;

	@FindBy(xpath = "//*[@id=\"/plan\"]/div[2]/ul/li[2]")
	private WebElement departuresLink;

	public void expandDropDown() {
		dropDown.click();
	}
	
	public void clickDeparesLink() {
		departuresLink.click();
	}
	
}
