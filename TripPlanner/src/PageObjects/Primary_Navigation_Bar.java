package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Primary_Navigation_Bar {

	@FindBy(id = "primary-nav")
	public WebElement primaryNavBar;

	public HomeMenu homeMenu = new HomeMenu();
	public PlanMenu planMenu = new PlanMenu();
	public TicketAndOpalMenu ticketsAndOpalMenu = new TicketAndOpalMenu();
	public TravelInfoMenu travelInfoMenu = new TravelInfoMenu();
	public ContactUsMenu contactUsMenu = new ContactUsMenu();

	public class HomeMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]")
		public WebElement homeMenuLink;

	}

	public class PlanMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
		public WebElement dropDown;


		@FindBy(xpath = "//*[@id=\"/plan\"]/div[2]/ul/li[2]")
		public WebElement departuresLink;
	
	}

	public class TicketAndOpalMenu {

		@FindBy(id = "//*[@id=\"primary-nav\"]/li[3]")
		public WebElement dropDown;

		@FindBy(linkText = "Regional tickets")
		public WebElement regionalTicketsLink;
	
	}

	public class TravelInfoMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[4]/a[1]")
		public WebElement dropDown;
	
		@FindBy(linkText = "On board menu")
		public WebElement onBoardMenuLink;
	
	}

	public class ContactUsMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[5]")
		public WebElement dropDown;
	
		@FindBy(xpath = "//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")
		public WebElement lostPropertyLink;
	
	}		
}
