package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class HomeMenu {

	private WebElement primaryNavBar;

	public HomeMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]")
	private WebElement homeMenuLink;

	public void clickHomeMenu() {
		
		HomeMenuLink.click();
	
	}
	
}

