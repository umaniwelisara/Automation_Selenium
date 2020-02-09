package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPageObjects;

public class ExcelDataProvider {
    String projectPath = System.getProperty("user.dir");
    String excelPath = projectPath + "\\excel\\data.xlsx";

    LoginPageObjects loginPageObjects = new LoginPageObjects(driver);


    static WebDriver driver= null;


    @Test(dataProvider="test1data")
    public void test1(String un, String pw) throws Exception {
       // System.out.println(un+"  |  "+pw);

        driver.get("http://165.22.245.236:8080/SLPAV1.08/");

        loginPageObjects.setTextInUserNameBox(un);
        loginPageObjects.setTextInPasswordBox(pw);
        loginPageObjects.clickLoginButton();
        Thread.sleep(2000);

    }





    @DataProvider(name = "test1data")
    public Object[][] getData() {
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }


    public Object[][] testData(String excelPath, String sheetName) {
        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excel.getCellDataString(i, j);
                System.out.println(cellData + "  |  ");
                data[i - 1][j] = cellData;
            }
        }

        return data;
    }
}
