package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class Primary_Navigation_Bar {
	
	private WebDriver driver;

	public Primary_Navigation_Bar(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "primary-nav")
	private WebElement primaryNavBar;
		
}
