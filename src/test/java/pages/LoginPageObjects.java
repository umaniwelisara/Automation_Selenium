package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPageObjects {
//    private static WebElement element = null;
//
//    public static WebElement textbox_username(WebDriver driver){
//        element = driver.findElement(By.id("uname"));
//        return element;
//    }
//    public static WebElement textbox_password(WebDriver driver){
//        element = driver.findElement(By.id("fpassword"));
//        return element;
//    }
//    public static WebElement button_login(WebDriver driver){
//        element = driver.findElement(By.id("btn-search"));
//        return element;
//    }

    WebDriver driver = null;
    //find the locaters for objects
   /* By textbox_username = By.id("uname");
    By textbox_password = By.name("fpassword");
    By button_login = By.id("btn-search");
*/
    By textbox_username = By.id("uname");
    By textbox_password = By.name("fpassword");
    By button_login = By.id("btn-search");

    By label_dashboard = By.xpath("//*[@id=\"dashboardbox\"]/div[1]/ol/li");

    By alertMessage = By.xpath("//*[@id=\"login-component\"]/div/div/div/div[1]/div/div[2]/div/div/form/span");

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    //add methods for actions
    public void setTextInUserNameBox(String username) {
        driver.findElement(textbox_username).sendKeys(username);
    }

    public void setTextInPasswordBox(String password) {
        driver.findElement(textbox_password).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(button_login).sendKeys(Keys.RETURN); //press enter

        // driver.findElement(button_login).click();
    }

    public String labelInDashboard() {
        return String.valueOf(driver.findElement(label_dashboard).isDisplayed());
    }

    public void getErrorMessage() {
        driver.findElement(alertMessage);

    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

   /*public WebElement explicitWait(Webdriver driver, String uniquename, int timeOutseconds){
        WebDriverWait wait = new WebDriverWait(driver,timeOutseconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(uniquename));
        return element;
    }*/

}
