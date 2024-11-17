package src.test.utils;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectsManager pageObjectsManager;

    public TestContextSetup() {
        pageObjectsManager = new PageObjectsManager();
    }

}
