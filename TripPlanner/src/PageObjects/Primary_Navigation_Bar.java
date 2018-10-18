package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class Primary_Navigation_Bar {
	
	private WebDriver driver;
/*
	public HomeMenu homeMenu = PageFactory.initElements(driver, HomeMenu.class);;
	public PlanMenu planMenu = PageFactory.initElements(driver, PlanMenu.class);;
	public TicketAndOpalMenu ticketsAndOpalMenu = PageFactory.initElements(driver, TicketAndOpalMenu.class);;
	public TravelInfoMenu travelInfoMenu = PageFactory.initElements(driver, TravelInfoMenu.class);;
*/
	public Primary_Navigation_Bar(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "primary-nav")
	private WebElement primaryNavBar;
		
}
