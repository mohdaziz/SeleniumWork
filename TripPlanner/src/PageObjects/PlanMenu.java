package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class PlanMenu {

	private WebElement primaryNavBar;
	
	public PlanMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
	private WebElement planMenuDropDown;
	
	private List<WebElement> optionsList = planMenuDropDown.findElements(By.tagName("li"));
	
	private WebElement departuresLink = dropDownList.get(1);
	
	
	public PlanMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}

	public void viewPlanMenuDropDownList() {
		planMenuDropDown.click();
	}
	
	public void clickDepartures() {
		departuresLink.click();	
	}	

}
