package com.sumup;

import com.sumup.drivermanagers.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    private static final int WAIT = 3000;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));

    }
    @AfterAll
    public static void quitDriver() {
        driver.quit();
   }
}

