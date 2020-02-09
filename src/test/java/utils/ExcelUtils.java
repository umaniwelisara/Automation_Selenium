package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) {

        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(excelPath);
            //     workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int getRowCount() {

        int rowCount = 0;
        rowCount = sheet.getPhysicalNumberOfRows();
      //  System.out.println("number of rows" + rowCount);
        return rowCount;

    }

    public static int getColCount() {

        int colCount = 0;
        colCount = sheet.getRow(0).getPhysicalNumberOfCells();
      //  System.out.println("number of cols " + colCount);
        return colCount;
    }

    public static String getCellDataString(int rowNum, int colNum) {
        String cellData = null;
        cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

       // System.out.println("cellData string: " + cellData);
        //sheet.getRow(rounum).getCell(colnum).getNumericCellValue();
        return cellData;

    }

    /*
    THIS IS WORKING FINE
*/
    public static Double getCellDataNumber(int rowNum, int colNum) {
        Double cellDataNum = null;
        cellDataNum = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

        System.out.println("cellData number :" + cellDataNum);
        //sheet.getRow(rounum).getCell(colnum).getNumericCellValue();
        return cellDataNum;
    }
}
