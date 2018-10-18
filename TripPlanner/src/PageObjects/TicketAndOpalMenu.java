package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class TicketAndOpalMenu {

	private WebDriver driver;

	public TicketAndOpalMenu(WebDriver driver) {
			this.driver = driver;
	}
	
	@FindBy(id = "//*[@id=\"primary-nav\"]/li[3]")
	private WebElement dropDown;

	@FindBy(linkText = "Regional tickets")
	private WebElement regionalTicketsLink;
	
	public void expandDropDown() {
		dropDown.click();
	}

	public void clickRegionalTicketsLink() {
		regionalTicketsLink.click();
	}	

}
