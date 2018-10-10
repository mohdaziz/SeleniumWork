package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class PlanMenu {

	public WebElement primaryNavBar;
	
	public PlanMenu(WebElement primaryNavBar) {
			this.primaryNavBar = primaryNavBar;
	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
	public WebElement dropDown;
	
	public List<WebElement> optionsList = dropDown.findElements(By.tagName("li"));
	
	public WebElement departuresLink = optionsList.get(1);
	
}
