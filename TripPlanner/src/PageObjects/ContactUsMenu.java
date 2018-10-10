package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class ContactUsMenu {

	public WebElement primaryNavBar;

	@FindBy(id = "primary-nav")
	public WebElement primaryNavBar;

	public ContactUsMenu(WebElement primaryNavBar) {
		this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[5]")
	public WebElement dropDown;
	
	@FindBy(xpath = "//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")
	public WebElement lostPropertyLink;
	
}
