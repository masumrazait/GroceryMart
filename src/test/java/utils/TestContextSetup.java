package utils;

import org.openqa.selenium.WebDriver;
import pagesObjects.PageObjectsManager;

public class TestContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectsManager pageObjectsManager;
    public TestBase testBase;

    public TestContextSetup() {
        testBase = new TestBase();
        pageObjectsManager = new PageObjectsManager(testBase.WebDriverManager());
    }

}
