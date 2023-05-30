package com.sumup.pages.fragments;

import com.sumup.pages.AbstractPage;
import com.sumup.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu extends AbstractPage {
    private static final By CountryDropDown = By.xpath("/html/body/div[1]/footer/div[1]/div/div[2]/div[2]/div/div/div");
    private static final By LOGO = By.xpath("/html/body/div[1]/header/div/div/div[1]/a");
    private static final By UnitedStates = By.linkText("United States");
    public static final By SEARCH_FIELD = By.xpath("//input[@type='text' and contains(@class, 'css-gn9vs9')]");


    public MainMenu(WebDriver driver) {
        super(driver);
    }
    public WebElement getCountryDropDown() {return driver.findElement(CountryDropDown);}
    public WebElement getLogo(){
        return WaitersManager.waitUntilElementIsClickable (driver, LOGO);
    }
    public WebElement getUnitedStates() {return driver.findElement(UnitedStates);}

    public static WebElement getSearchField(){ return driver.findElement(SEARCH_FIELD);}

}
