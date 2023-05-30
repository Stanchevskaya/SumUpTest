package com.sumup.flow;

import com.sumup.flow.commonflow.BaseFlow;
import com.sumup.pages.fragments.MainMenu;
import org.openqa.selenium.WebDriver;

public class SearchFlow extends BaseFlow {

    private MainMenu searchField;
    public SearchFlow(WebDriver driver) {
        super(driver);
        searchField = new MainMenu(driver);
    }

    public void setSearch (String searchField){MainMenu.getSearchField().sendKeys(searchField);
    }
}

