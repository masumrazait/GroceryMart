package src.test.utils;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectManager pageObjectManager;
    public TestContextSetup() {
        pageObjectManager = new PageObjectManager(driver);
    }
}
