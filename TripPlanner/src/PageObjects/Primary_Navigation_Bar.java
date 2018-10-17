package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Primary_Navigation_Bar {
	
	private WebDriver driver;
	public HomeMenu homeMenu = PageFactory.initElements(driver, HomeMenu.class);;
	public PlanMenu planMenu = PageFactory.initElements(driver, PlanMenu.class);;
	public TicketAndOpalMenu ticketsAndOpalMenu = PageFactory.initElements(driver, TicketAndOpalMenu.class);;
	public TravelInfoMenu travelInfoMenu = PageFactory.initElements(driver, TravelInfoMenu.class);;
	public ContactUsMenu contactUsMenu = PageFactory.initElements(driver, ContactUsMenu.class);;

	public Primary_Navigation_Bar(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "primary-nav")
	public WebElement primaryNavBar;

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
