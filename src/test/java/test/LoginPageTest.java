package test;

import config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObjects;
import org.openqa.selenium.By;

import static test.java.Constants.BASE_URL;


public class LoginPageTest {

   private  static WebDriver driver=null;

   //this works
@BeforeTest
  public  void setUpTest(){

      driver = TestBase.getDriver();
  }

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

  @Test (priority = 1)
   public static void testValidUserLogin() {

        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        driver.get(BASE_URL);

        loginPageObjects.setTextInUserNameBox("admin");
        loginPageObjects.setTextInPasswordBox("a");
        loginPageObjects.clickLoginButton();

//
// Thread.sleep(1000);

         loginPageObjects.implicitWait(10);

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"dashboardbox\"]/div[1]/ol/li")).getText(),"Dashboard");
        System.out.println("test passed: valid login");

    }
@Test(priority = 2)
    public static void testInvalidUserLogin(){

        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        driver.get(BASE_URL);

        loginPageObjects.setTextInUserNameBox("admina");
        loginPageObjects.setTextInPasswordBox("1");
        loginPageObjects.clickLoginButton();


        loginPageObjects.implicitWait(10);


        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login-component\"]/div/div/div/div[1]/div/div[2]/div/div/form/span")).getText(),"Username or Password is Invalid..!!");
        System.out.println("test passed : invalid login");
//      Assert.assertEquals(loginPageObjects.labelInDashboard(),"Dashboard");


    }
    //this works
   @AfterTest
   public  void tearDownTest(){
      driver.close();
      //driver.quit();
    //  System.out.println("test passed");
      PropertiesFile.setProperties();
   }


}
