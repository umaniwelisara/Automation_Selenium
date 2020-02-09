package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class UserPageObjects {

    WebDriver driver = null;

    By button_user = By.xpath("//*[@id=\"cdk-accordion-child-16\"]/div/mat-nav-list/a/div");
    By button_createNew = By.xpath("/html/body/app-root/portal-layout-classic/mat-sidenav-container/mat-sidenav-content/div/div/div/app-user/div/div/div[2]/div[2]/div/div[1]/div[1]/button");

    By textbox_empNo = By.id("empNo");
    By textbox_name = By.id("firstName");
    By textbox_lastName = By.id("lastName");
    By textbox_userName = By.id("username");
    By textbox_nic = By.id("nic");
    By textbox_phone = By.id("contactNo");
    By textbox_email = By.name("email");
    By dropdown_designation = By.name("userRoleCode");
    By dropdown_division = By.name("divisionId");
    By dropdown_userRole = By.name("userRoleMapping");

    By button_save = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[11]/div/button[1]");


    By button_reset = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[11]/div/button[2]");

    By button_confirm_savemessage = By.xpath("/html/body/div[4]/div/div[3]/button[1]");
    By button_cancel_savemessage = By.xpath("/html/body/div[4]/div/div[3]/button[2]");

    By button_success_savemessage = By.xpath("/html/body/div[4]/div/div[3]/button[1]");

    By label_validation_specialcharactors_fname = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[2]/div");
    By label_validation_specialcharactors_lname = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[3]/div[2]/div");
    By label_validation_specialcharactors_username = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[4]/div[2]/div");

    By label_validation_required_eno = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[2]/div");
    By label_validation_required_fname = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[2]/div");
    By label_validation_required_lname = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[3]/div[2]/div");
    By label_validation_required_uname = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[4]/div[2]/div");
    By label_validation_required_designation = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[8]/div[2]/div");
    By label_validation_required_division = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[9]/div[2]/div");
    By label_validation_required_userrole = By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[10]/div[2]/div");

    By button_close_usercreation_window = By.xpath("//*[@id=\"save\"]/div/div/div[1]/button");

    public UserPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserButton() {
        driver.findElement(button_user).click();
    }

    public void clickCreateNewButton() {
        driver.findElement(button_createNew).click();
    }

    public void setTextInEmpNo(String empNo) {
        driver.findElement(textbox_empNo).sendKeys(empNo);
    }

    public void setTextInName(String name) {
        driver.findElement(textbox_name).sendKeys(name);
    }

    public void setTextInLastName(String lname) {
        driver.findElement(textbox_lastName).sendKeys(lname);
    }

    public void setTextInUserName(String username) {
        driver.findElement(textbox_userName).sendKeys(username);
    }

    public void setTextInNIC(String nic) {
        driver.findElement(textbox_nic).sendKeys(nic);
    }

    public void setTextInPhone(String phone) {
        driver.findElement(textbox_phone).sendKeys(phone);
    }

    public void setTextInEmail(String email) {
        driver.findElement(textbox_email).sendKeys(email);
    }

    public void setTextInDesignation(int designation) {
        Select dropdownDesignation = new Select(driver.findElement(dropdown_designation));
        dropdownDesignation.selectByIndex(designation);
    }

    public void setTextInDivision(int division) {
        Select dropdownDivision = new Select(driver.findElement(dropdown_division));
        dropdownDivision.selectByIndex(division);
    }

    public void setTextInUserRole(int userRole) {
        Select dropdownUserRole = new Select(driver.findElement(dropdown_userRole));
        dropdownUserRole.selectByIndex(userRole);
    }

    public void clickSave() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(button_save));
        driver.findElement(button_save).click();
    }

    public void clickReset() {
        driver.findElement(button_reset).click();
    }

    public void clickButtonConfirmSaveMessage() {
        driver.findElement(button_confirm_savemessage).click();
    }

    public void clickButtonCancelSavemessage() {
        driver.findElement(button_cancel_savemessage).click();
    }

    public void clickButtonSuccessSaveMessage() {
        driver.findElement(button_success_savemessage).click();
    }

    public void labelValidationRequiredEno() {
        driver.findElement(label_validation_required_eno);
    }// Employee No is required

    public void labelValidationRequiredFname() {
        driver.findElement(label_validation_required_fname);
    }// First Name is required

    public void labelValidationRequiredLname() {
        driver.findElement(label_validation_required_lname);
    }// Last Name is required

    public void labelValidationRequiredUname() {
        driver.findElement(label_validation_required_uname);
    }// User Name is required

    public void labelValidationRequiredDesignation() {
        driver.findElement(label_validation_required_designation);
    }// Designation is required

    public void labelValidationRequiredDivision() {
        driver.findElement(label_validation_required_division);
    }// Division is required

    public void labelValidationRequiredUserrole() {
        driver.findElement(label_validation_required_userrole);
    }// User Role is required

    public void clickButtonCloseWindow() {
        driver.findElement(button_close_usercreation_window);
    }

    public void labelValidationSpecialCharactorsFname() {
        driver.findElement(label_validation_specialcharactors_fname);
    }// Special Characters are not allowed

    public void labelValidationSpecialCharactorsLname() {
        driver.findElement(label_validation_specialcharactors_lname);
    }// Special Characters are not allowed

    public void labelValidationSpecialCharactorsUname() {
        driver.findElement(label_validation_specialcharactors_username);
    }// Special Characters are not allowed


    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }


}
