package config;

import test.LoginPageTesttestng;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");
    static String browser;

    public static void getProperties() {

        try {


            InputStream input = new FileInputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
            prop.load(input);
            browser = prop.getProperty("browser");

//            LoginPageTesttestng.browserName=browser;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void setProperties() {

        try {

            OutputStream output = new FileOutputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
            prop.setProperty("result","pass");
            prop.store(output,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBrowser(){
        return browser;
    }
}

