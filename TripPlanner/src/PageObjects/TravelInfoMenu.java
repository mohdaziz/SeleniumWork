package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class TravelInfoMenu {

	private WebDriver driver;

	public TravelInfoMenu(WebDriver driver) {
			this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[4]/a[1]")
	private WebElement dropDown;
	
	@FindBy(linkText = "On board menu")
	private WebElement onBoardMenuLink;

	public void expandDropDown() {
		dropDown.click();
	}
	
	public void clickOnBoardMenuLink() {
		onBoardMenuLink.click();
	}
	
}
