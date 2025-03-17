package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAUrl");
        if (driver == null) {
            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (prop.getProperty("browser") == ("firfox")) {
                //System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
                //driver = new ChromeDriver();
            }

            driver.get(url);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
