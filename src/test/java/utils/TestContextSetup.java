package utils;

import org.openqa.selenium.WebDriver;
import pagesObjects.PageObjectsManager;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectsManager pageObjectsManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectsManager = new PageObjectsManager(testBase.WebDriverManager());
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }

}
