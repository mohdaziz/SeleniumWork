package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PlanMenu {

//	public WebElement primaryNavBar;
	
//	public PlanMenu(WebElement primaryNavBar) {
//			this.primaryNavBar = primaryNavBar;
//	}

	@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
	public WebElement dropDown;
	
//	public List<WebElement> optionsList = dropDown.findElements(By.tagName("li"));
//	//*[@id="/plan"]/div[2]/ul/li[2]/a
//	public WebElement departuresLink = optionsList.get(1);

	@FindBy(xpath = "//*[@id=\"/plan\"]/div[2]/ul/li[2]")
	public WebElement departuresLink;
	
}
