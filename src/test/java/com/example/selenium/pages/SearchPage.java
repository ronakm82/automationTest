package com.example.selenium.pages;

import com.example.selenium.runners.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class SearchPage implements BasePage {

    @FindBy(how = How.NAME, using = "username")
    private WebElement username;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submit;

    @FindBy(how = How.XPATH, using = "//*[@id='searchbox_homepage']/div/div/div/button")
    private WebElement searchButton;

    public void enterCredentials (){
        try {
            username.sendKeys("admin");
            Thread.sleep(200);
            password.sendKeys("admin123");
        }
        catch(Exception e){
          e.printStackTrace();
        }
    }

    public void pressSearchButton(){
        submit.click();
    }
}