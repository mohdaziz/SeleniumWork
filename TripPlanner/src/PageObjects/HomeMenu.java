package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class HomeMenu {

	private WebDriver driver;
	
	public HomeMenu(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]")
	private WebElement homeMenuLink;

	public void clickHome() {
		homeMenuLink.click();
	}
	
}
