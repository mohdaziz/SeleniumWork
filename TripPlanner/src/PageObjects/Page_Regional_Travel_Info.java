package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Page_Regional_Travel_Info {

	private WebDriver driver;
	
	public Page_Regional_Travel_Info(WebDriver driver) {
		this.driver = driver;
	}

	public RegularMenu regularMenu = PageFactory.initElements(driver, RegularMenu.class);

	public class RegularMenu {

		@FindBy(id = "accordion-hot-drinks-content-header")
		public WebElement hotDrinksToggleArrow;

	}

}

