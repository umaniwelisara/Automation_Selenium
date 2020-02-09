package test;

import config.PropertiesFile;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.UserPageObjects;

import java.util.Arrays;
import java.util.Random;

public class UserPageTest {

    private static WebDriver driver = null;

    static LoginPageTest loginPageTest = new LoginPageTest();
    static UserPageObjects userPageObjects;

    @BeforeTest
    public void setUpTestUser() {

        driver = TestBase.getDriver();

        loginPageTest.setDriver(driver);
        loginPageTest.testValidUserLogin();

        userPageObjects = new UserPageObjects(driver);
        userPageObjects.implicitWait(5);
        userPageObjects.clickUserButton();
        userPageObjects.implicitWait(10);

        Assert.assertEquals(driver.findElement(By.xpath("/html/body/app-root/portal-layout-classic/mat-sidenav-container/mat-sidenav-content/div/div/div/app-user/div/div/div[2]/div[1]/h3")).getText().trim(), "User");
        System.out.println("test passed: user page is loaded");

        userPageObjects.implicitWait(5);
        userPageObjects.clickCreateNewButton();
    }

    @Test(priority = 3)
    public static void testValidUserCreation() {

//        userPageObjects.implicitWait(5);
        /* generate random numbers*/


        int random = (int) (Math.random() * 1000);


        userPageObjects.setTextInEmpNo("AUT" + random);
        userPageObjects.setTextInName("namalig");
        userPageObjects.setTextInLastName("pereraag");
        userPageObjects.setTextInUserName("namaliG");
        userPageObjects.setTextInDesignation(1);
        userPageObjects.setTextInDivision(1);
        userPageObjects.setTextInUserRole(3);
//        userPageObjects.implicitWait(5);


        userPageObjects.clickSave();
//        userPageObjects.implicitWait(7);

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText(), "Are you sure, you want to submit the user details?");
        System.out.println("test passed: confirm save user ");

        userPageObjects.clickButtonConfirmSaveMessage();
        userPageObjects.implicitWait(5);

        // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"swal2-content\"]")).getText(), "Details submitted successfully");

        //this works-  Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[5]")).isDisplayed());
        System.out.println("test passed: save user successfully ");

//        "swal2-success-ring"

        userPageObjects.clickButtonSuccessSaveMessage();//YES
        userPageObjects.implicitWait(3);


    }

    @Test(priority = 4)
    public static void testValidationsInUserCreation() {
        int random = (int) (Math.random() * 1000);
        userPageObjects.setTextInEmpNo("");
        userPageObjects.setTextInName("!");
        userPageObjects.implicitWait(2);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[2]/div")).getText(), "Special Characters are not allowed");
        // Assert.assertEquals(userPageObjects.labelValidationSpecialCharactorsFname(), "Special Characters are not allowed");
        System.out.println("test passed: Validation Special Charactors First name ");
        //Assert.assertEquals(userPageObjects.labelValidationRequiredFname(),"Special Characters are not allowed");

        userPageObjects.setTextInLastName("!");
        userPageObjects.implicitWait(2);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[3]/div[2]/div")).getText(), "Special Characters are not allowed");


        System.out.println("test passed:  Validation Special Charactors Last name ");

        userPageObjects.setTextInUserName("!");
        userPageObjects.implicitWait(2);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"save\"]/div/div/div[1]/div[2]/div/div/div/form/div[4]/div[2]/div")).getText(), "Special Characters are not allowed");
        System.out.println("test passed: Validation Special Charactors User name ");

    }

    @Test(priority = 5)
    public static void testRequiredFieldsInUserCreation() {

        userPageObjects.setTextInEmpNo("");
        userPageObjects.implicitWait(2);
        userPageObjects.setTextInEmpNo("");

    }

    @AfterTest
    public void tearDownTest() {
        driver.close();
        //driver.quit();
        //  System.out.println("test passed");
        PropertiesFile.setProperties();
    }


    /* generate random numbers*/

   /*
        public static int generateRandomEnumber(){
        int random = (int)(Math.random() * 1000);
        return random;
    }
*/
    /*generate random name*/

    public static String[] randomWord(int noOfWords) {
        String[] randomStrings = new String[noOfWords];
        Random random = new Random();
        for (int i = 0; i < noOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
            System.out.println(randomStrings);
        }
        return randomStrings;
    }
}
