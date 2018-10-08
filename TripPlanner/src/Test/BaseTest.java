package test;

//import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
//import org.junit.Test;
import org.apache.log4j.Logger;

//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;
	private static Logger LOGGER = null;
	private static final HOMEPAGE = "https://transportnsw.info";

    @BeforeClass
    public void PreTestCaseRunSetup() throws MalformedURLException {

		LOGGER = getLogger("testStep");
		LOGGER.debub("set webdriver to safarideriver");
        driver = new SafariDriver();
		LOGGER.debug("set window dimension");
        driver.manage().window().setSize(new Dimension(1024, 1440));
		LOGGER.debug("Set implicit wait time");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterClass
    public void closeBrowser() {

        driver.quit();

    }
}
