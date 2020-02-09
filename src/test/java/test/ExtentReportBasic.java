/*
package test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.Status;
import com.relevantcodes.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportBasic {

    public static void main (String[] args) throws Exception{
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test1 = extent.createTest("MyFirstTest");


        LoginPageTesttestng logintest = new LoginPageTesttestng();
        test1.log(Status.INFO, "start TC...");

        logintest.setUpTest();
        logintest.loginPageTest();
        logintest.tearDownTest();
        test1.pass("TC- login success");
        test1.info("TC complete..");
        extent.flush();
    }
}
*/
