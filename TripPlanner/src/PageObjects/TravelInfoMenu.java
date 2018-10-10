package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class TravelInfoMenu {

	@FindBy(id = "primary-nav")
	public WebElement primaryNavBar;

	public TravelInfoMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}
	
	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[4]/a[1]")
	public WebElement dropDown;
	
	@FindBy(linkText = "On board menu")
	public WebElement onBoardMenuLink;
	
}
