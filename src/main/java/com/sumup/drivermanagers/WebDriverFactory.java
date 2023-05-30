package com.sumup.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory(){
    }
    public static WebDriver getDriver (String driver) {
        switch (driver) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
                return new EdgeDriver();
            default: System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();

        }
    }
}
