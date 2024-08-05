package com.example.selenium.steps;

import com.example.selenium.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchSteps {

    @Autowired
    private SearchPage searchPage;

    @Given("a user typing username and password in the login page")
    public void aUserTypingInTheSearchInput() {
        searchPage.enterCredentials();
    }

    @When("^presses the submit button$")
    public void pressesTheSearchButton() {
        searchPage.pressSearchButton();
    }
}
