package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Primary_Navigation_Bar {

	@FindBy(id = "primary-nav")
	public WebElement primaryNavBar;

	public HomeMenu homeMenu = new HomeMenu(primaryNavBar);
	public PlanMenu planMenu = new PlanMenu(primaryNavBar);
	public TicketAndOpalMenu ticketsAndOpalMenu = new TicketAndOpalMenu(primaryNavBar);	
	public TravelInfoMenu travelInfoMenu = new TravelInfoMenu(primaryNavBar);	
	public ContactUsMenu contactUsMenu = new ContactUsMenu(primaryNavBar);	

}
