import config.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import test.LoginPageTest;
import test.UserPageTest;
import utils.ExcelDataProvider;
import utils.ExcelUtils;

import java.util.List;

public class BrowserTest {
    public static void main(String[] args) throws Exception {

/*

      String projectPath = System.getProperty("user.dir");
        System.out.println("project path : "+projectPath);
        System.setProperty(
                "webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
//        System.setProperty(
//                "webdriver.gecko.driver", projectPath+"\\drivers\\firefoxDriver\\geckodriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

       driver.findElement(By.id("search_query_top")).sendKeys("dress");

      // driver.findElement(By.name("submit_search")).click();

        // press 'enter key'
       driver.findElement(By.name("submit_search")).sendKeys(Keys.RETURN);

        List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
        int count = listofInputElements.size();
        System.out.println("list of Input Elements: "+ count);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

        System.out.println("TC pass");

*/

        //-----------------------------------------------------------------
        //   this works
//===============================LOGIN PAGE=====================================================

/*

        LoginPageTest loginPageTest = new LoginPageTest();
        loginPageTest.setUpTest();
        loginPageTest.testValidUserLogin();
        loginPageTest.tearDownTest();


        loginPageTest.setUpTest();
        loginPageTest.testInvalidUserLogin();
        loginPageTest.tearDownTest();
*/


//================================USER===================================================


        UserPageTest userPageTest = new UserPageTest();
      /*      userPageTest.setUpTestUser();
              userPageTest.testValidUserCreation();
          //  userPageTest.tearDownTest();
*/
        userPageTest.setUpTestUser();
        userPageTest.testValidationsInUserCreation();
        userPageTest.tearDownTest();


//================================USER ROLE===================================================


//============================================================================================
        // take data from excel file . check ExcelUtils.java for more info
        //    String projectPath = System.getProperty("user.dir");
      /*  ExcelUtils excelUtils = new ExcelUtils(projectPath + "\\excel\\data.xlsx", "Sheet1");
        excelUtils.getRowCount();
        excelUtils.getColCount();
        excelUtils.getCellDataString(0, 0);
        excelUtils.getCellDataString(0, 1);
        String un1 = excelUtils.getCellDataString(1, 0);
        String pw1 = excelUtils.getCellDataString(1, 1);

        ExcelDataProvider excelDataProvider = new ExcelDataProvider();
        excelDataProvider.testData(projectPath + "\\excel\\data.xlsx", "Sheet1");
        excelDataProvider.test1(un1,pw1);*/
///.........................


    }

}
