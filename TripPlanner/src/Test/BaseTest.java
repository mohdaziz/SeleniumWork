package Test;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.apache.log4j.Logger.getLogger;

public class BaseTest {

    static WebDriver driver;
	static Logger LOGGER = null;
	static final String HOMEPAGE = "https://transportnsw.info";

    @BeforeClass
    public static void PreTestCaseRunSetup() throws MalformedURLException {

		LOGGER = getLogger("testStep");
		LOGGER.debug("set webdriver to safarideriver");
        driver = new SafariDriver();
		LOGGER.debug("set window dimension");
        driver.manage().window().setSize(new Dimension(1024, 1440));
		LOGGER.debug("Set implicit wait time");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void closeBrowser() {

        driver.quit();

    }
}
