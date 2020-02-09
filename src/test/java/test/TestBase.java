package test;

import config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    public static String browserName = null;
    private static WebDriver driver = null;

    public static WebDriver getDriver() {

        String projectPath = System.getProperty("user.dir");
        PropertiesFile.getProperties();
        browserName = PropertiesFile.getBrowser();

        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty(
                    "webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();


        } else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty(
                    "webdriver.chrome.driver", projectPath + "\\drivers\\firefoxdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}
