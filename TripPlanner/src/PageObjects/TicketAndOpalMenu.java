package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class TicketAndOpalMenu {

	public WebElement primaryNavBar;

	public TicketAndOpalMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}
	
	@FindBy(id = "//*[@id=\"primary-nav\"]/li[3]")
	public WebElement dropDown;

	@FindBy(linkText = "Regional tickets")
	public WebElement regionalTicketsLink;
	
}
