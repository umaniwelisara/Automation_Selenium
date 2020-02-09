/*

package test;

import ch.qos.logback.core.status.Status;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObjects;

public class ExtentReportDemo {

    private static WebDriver driver = null;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;

    @BeforeTest
    public void setUpTest() {

      */
/*  htmlReporter = new ExtentHtmlReporter("Reports.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test1= extent.createTest("1st test","sample test");*//*


        String projectPath = System.getProperty("user.dir");
        System.out.println("project path : " + projectPath);
        System.setProperty(
                "webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        driver.get("http://165.22.245.236:8080/SLPAV1.08/#/external/login");
        loginPageObjects.setTextInUserNameBox("admin");
        loginPageObjects.setTextInPasswordBox("a");
        loginPageObjects.clickLoginButton();
        driver.close();
        driver.quit();



*/
/*        test1.log(Status.INFO,"start TC");
        test1.pass("okk");
        test1.info("TC done");*//*


        //write evrything intp report
        extent.flush();
    }

   */
/* @Test
    public static void loginPageTest() {

        ExtentTest test= extent.createTest("1st test","sample test");
        test.log(Status.INFO,"shows log status");
        test.info("details..........");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build);
        test.addScreenCaptureFromPath("screenshot.png");

        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        driver.get("http://165.22.245.236:8080/SLPAV1.08/#/external/login");
        loginPageObjects.setTextInUserNameBox("umani");
        loginPageObjects.setTextInPasswordBox("a");
        loginPageObjects.clickLoginButton();


    }

    @AfterTest
    public void tearDownTest() {
        driver.close();
        driver.quit();

        extent.flush();

        System.out.println("test passed");
    }*//*

}

*/
