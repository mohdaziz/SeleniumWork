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

	private class HomeMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[1]")
		private WebElement homeMenuLink;

	}
	
	private class PlanMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[2]")
		private WebElement dropDown;
	
		private List<WebElement> optionsList = dropDown.findElements(By.tagName("li"));
		private WebElement departuresLink = optionsList.get(1);

		@FindBy(xpath = "//*[@id=\"/plan\"]/div[2]/ul/li[2]")
		private WebElement departuresLink;
	
	}

	private class TicketAndOpalMenu {

		@FindBy(id = "//*[@id=\"primary-nav\"]/li[3]")
		private WebElement dropDown;

		@FindBy(linkText = "Regional tickets")
		private WebElement regionalTicketsLink;
	
	}
	
	private class TravelInfoMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[4]/a[1]")
		private WebElement dropDown;
	
		@FindBy(linkText = "On board menu")
		private WebElement onBoardMenuLink;
	
	}

	private class ContactUsMenu {

		@FindBy(xpath = "//*[@id=\"primary-nav\"]/li[5]")
		private WebElement dropDown;
	
		@FindBy(xpath = "//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a")
		private WebElement lostPropertyLink;
	
	}		
}
