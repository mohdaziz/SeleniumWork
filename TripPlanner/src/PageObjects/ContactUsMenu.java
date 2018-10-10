package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsMenu {

	public WebElement primaryNavBar;

	public ContactUsMenu(WebElement primaryNavBar) {
		this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[5]")
	public WebElement dropDown;
	
	@FindBy(xpath = "//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")
	public WebElement lostPropertyLink;
	
}
