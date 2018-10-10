package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMenu {

	public WebElement primaryNavBar;

	public HomeMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]")
	public WebElement homeMenuLink;

}
