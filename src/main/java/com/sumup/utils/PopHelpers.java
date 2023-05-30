package com.sumup.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopHelpers {

    private static final By ACCEPT_COOKIES_BUTTON = By.id("onetrust-accept-btn-handler");
    private static final By PROCEED_TO_THE_UK_SITE = By.xpath("/html/body/div[6]/div/div/div/div/button");

    private PopHelpers() {
    }
    public static void acceptCookiesButton(WebDriver driver) {
        try {
            driver.findElement(ACCEPT_COOKIES_BUTTON).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop up is not displayed");
        }
    }
    public static void proceedToTheUKSite(WebDriver driver) {
        try {
            driver.findElement(PROCEED_TO_THE_UK_SITE).click();
        }
        catch (NoSuchElementException e) {
            System.out.println("Pop up for country is not displayed");
        }
    }


    }
