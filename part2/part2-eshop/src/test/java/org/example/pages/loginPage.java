package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Hooks.driver,this);

    }

    @FindBy(xpath = "//div[@class=\"user-profile\"]")
    public WebElement goToLoginPage;

    @FindBy(xpath = "//input[@id=\"username\"]")
    public WebElement mobileNoInput;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement passInput;

    @FindBy(xpath = "//input[@id=\"submitBtn\"]")
    public WebElement goToYourAccount;
}
