package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Regional_Travel_Info {

	public RegularMenu regularMenu = new RegularMenu();

	public class RegularMenu {

		@FindBy(id = "accordion-hot-drinks-content-header")
		public WebElement hotDrinksToggleArrow;

	}

}

