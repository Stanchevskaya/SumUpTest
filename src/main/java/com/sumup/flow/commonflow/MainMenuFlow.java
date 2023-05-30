package com.sumup.flow.commonflow;

import com.sumup.pages.fragments.MainMenu;
import org.openqa.selenium.WebDriver;

public class MainMenuFlow {


    private MainMenu mainMenu;

    public MainMenuFlow(WebDriver driver) {
        mainMenu = new MainMenu(driver);
    }

    public MainMenu getMainMenu() {

        return mainMenu;
    }

    public void navigateToCountryDropDown() { mainMenu.getCountryDropDown().click();
    }

    public void navigateToLogo() {mainMenu.getLogo().click();
    }

    public void navigateToUnitedStates() {mainMenu.getUnitedStates().click();}
}
