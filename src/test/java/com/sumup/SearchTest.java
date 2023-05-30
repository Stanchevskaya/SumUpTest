package com.sumup;

import com.sumup.flow.SearchFlow;
import com.sumup.flow.commonflow.MainMenuFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.sql.SQLOutput;
import java.util.List;

import static com.sumup.utils.PopHelpers.*;

public class SearchTest extends BaseTest {

    private SearchFlow searchFlow = new SearchFlow(driver);
    @BeforeAll
    public static void navigateToMainPage(){
        driver.get("https://help.sumup.com/en-GB");
        driver.manage().window().maximize();
        acceptCookiesButton(driver);
        proceedToTheUKSite(driver);
    }
    @Test
    public void searchTest() {
        searchFlow.getMainMenuFlow().navigateToCountryDropDown();
        searchFlow.getMainMenuFlow().navigateToUnitedStates();
        searchFlow.setSearch("Invoice");
        WebElement searchInput = driver.findElement(By.xpath("//input[@type='text' and contains(@class, 'css-gn9vs9')]\n"));
        searchInput.sendKeys(Keys.ENTER);
        String actualResults = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/h2"))
                .getText();
        String expectedResults = "Results for \"Invoice\" (29)";
        Assertions.assertEquals(actualResults, expectedResults);
        System.out.println("# of results: " + expectedResults);

        String expectedTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[20]/a"))
                .getText();
        WebElement lastLink = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[20]/a"));
        lastLink.click();
        String actualTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/h1"))
                .getText();
        Assertions.assertEquals(expectedTitle, actualTitle);
        System.out.println("Expected title for the last link: " + expectedTitle);
        System.out.println("Actual title for the last link: " + actualTitle);

        WebElement returnToHomePage = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[1]/a"));
        returnToHomePage.click();
        String homePageTitle = driver.findElement(By.xpath("/html/body/div[1]/div/header/strong"))
                .getText();
        String expectedHomePageTitle = "How can we help?";
        Assertions.assertEquals(homePageTitle, expectedHomePageTitle);
        System.out.println("Expected home page title: " + expectedHomePageTitle);
        System.out.println("Actual home page title: " + homePageTitle);

        }
    }

