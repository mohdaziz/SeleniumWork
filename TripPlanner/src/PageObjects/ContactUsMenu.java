package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class ContactUsMenu {
	
	private WebDriver driver;
	
	public ContactUsMenu(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[5]")
	private WebElement dropDown;
	
	@FindBy(xpath = "//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")
	private WebElement lostPropertyLink;
	
	public void expandDropDown() {
		dropDown.click();
	}
	
	public void clickLostPropertyLink() {
		lostPropertyLink.click();
	}
	
}
