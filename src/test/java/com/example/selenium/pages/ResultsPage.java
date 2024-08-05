package com.example.selenium.pages;

import com.example.selenium.helpers.VisibilityHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResultsPage implements BasePage {

    private static final String RESULTS_LOCATOR = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6";

    @Autowired
    private VisibilityHelper visibilityHelper;


    public void assertResultsArePresent(){
        visibilityHelper.waitForPresenceOf(By.xpath(RESULTS_LOCATOR));
    }
}