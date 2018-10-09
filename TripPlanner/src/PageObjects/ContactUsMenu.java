package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Pages;
import org.openqa.selenium.support.FindBy;

public class Primary_Navigation_Bar {

	@FindBy(id = "primary-nav")
	public static WebElement primaryNavBar;

	public static HomeMenu homeMenu = new HomeMenu(primaryNavBar);
	public static PlanMenu planMenu = new planMenu(primaryNavBar);
	public static TicketAndOpalMenu ticketsAndOpalMenu = new TicketAndOpalMenu(primaryNavBar);	
	public static TravelInfoMenu travelInfoMenu = new TravelInfoMenu(primaryNavBar);	
	public ContactUsMenu contactUsMenu = new ContactUsMenu(primaryNavBar);	
		
    public static WebElement primaryNavBar(WebDriver driver) {
        return driver.findElement(By.id("primary-nav"));
    }

    public static class Home {

        public static WebElement homeContainer(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[1]"));
        }
    }

    public static class Plan {

        public static WebElement planContainer(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[2]"));
        }

        public static WebElement planDropDownList(WebDriver driver) {
            return driver.findElement(By.id("/plan"));
        }

        public static WebElement departuresOption(WebDriver driver) {
            return planDropDownList(driver).findElements(By.tagName("li")).get(1);
        }

    }

    public static class TicketsAndOpal {

        public static WebElement ticketsAndOpalContainer(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[3]"));
        }

        public static WebElement regionalTicketsLink(WebDriver driver) {
            return ticketsAndOpalContainer(driver).findElement(By.linkText("Regional tickets"));
        }

    }

    public static class TravelInfo {

        public static WebElement travelInfoContainer(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[4]/a[1]"));
        }

		public static class RegionalTravel {
            public static WebElement onBoardMenuLink(WebDriver driver) {
                return driver.findElement(By.linkText("On board menu"));
                //*[@id="/travel-info"]/div/ul/li[3]/div/ul/li[3]/a

            }

        }
    }

    public static class ContactUs {

        public static WebElement contactUsContainer(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[5]"));
        }

        public static WebElement lostPropertyLink(WebDriver driver) {
            return driver.findElement(By.xpath("//*[@id=\"/contact-us\"]/div[2]/ul/li[3]/a"));

        }
    }

}

